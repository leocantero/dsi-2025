package ar.edu.utn.frba.dds.climalert.climalert.scheduler;

import ar.edu.utn.frba.dds.climalert.climalert.services.ServiceAlerta;
import ar.edu.utn.frba.dds.climalert.climalert.services.ServiceClima;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerClimaAlerta {
    private Logger logger = LoggerFactory.getLogger(SchedulerClimaAlerta.class);

    @Autowired
    private ServiceClima serviceClima;
    @Autowired
    private ServiceAlerta serviceAlerta;

    @Scheduled(fixedRate = 10000)
    public void actualizarYAnalizar() {
        serviceClima.actualizarClimas()
                .doOnSuccess(v -> logger.info("Actualización de clima completada"))
                .doOnError(e -> logger.error("Error en la actualización de clima: {}", e.getMessage()))
                .then(serviceAlerta.analizarClimas()
                        .doOnSuccess(v -> logger.info("Análisis de climas completado"))
                        .doOnError(e -> logger.error("Error en el análisis del clima: {}", e.getMessage())))
                .subscribe();
    }
}
