package ar.edu.utn.frba.dds.climalert.climalert.scheduler;

import ar.edu.utn.frba.dds.climalert.climalert.services.ServiceAlerta;
import ar.edu.utn.frba.dds.climalert.climalert.services.ServiceClima;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerAlerta {
    private Logger logger = LoggerFactory.getLogger(SchedulerClima.class);

    @Autowired
    private ServiceAlerta serviceAlerta;

    @Scheduled(fixedRate = 20000)
    public void procesarDatos(){
        serviceAlerta.analizarClimas()
                .doOnSuccess(v -> logger.info("Actualización de clima completada"))
                .doOnError(e -> logger.error("Error en la actualización de clima: {}", e.getMessage()))
                .subscribe();

    }


}
