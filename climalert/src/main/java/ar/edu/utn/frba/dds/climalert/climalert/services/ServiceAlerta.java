package ar.edu.utn.frba.dds.climalert.climalert.services;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador.Validador;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryClima;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import java.util.List;

public class ServiceAlerta {
    // TODO: Implementar el servicio de alerta

    @Autowired
    private Validador validador;

    @Autowired
    private ServiceClima serviceClima;
    @Autowired
    private IRepositoryClima repositoryClima;

    public Mono<Void> analizarClimas() {
        List<Clima> climasAnalizar = repositoryClima.obtenerClimas();
        climasAnalizar.stream()
                .filter(validador::cumpleCondiciones)
                .forEach(clima -> {
                    // Aquí se podría generar una alerta o realizar alguna acción
                    // con el clima que cumple las condiciones.
                    System.out.println("Alerta generada para el clima: " + clima);
                });
        // TODO: Implementar la lógica de análisis de climas de forma ASINCRONICA (esta hecho de forma sincrona)
        return null;
    }

}
