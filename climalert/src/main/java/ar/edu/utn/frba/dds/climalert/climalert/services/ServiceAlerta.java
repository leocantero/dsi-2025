package ar.edu.utn.frba.dds.climalert.climalert.services;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
//import ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador.Validador;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador.Validador;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryCiudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryClima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

@Service
public class ServiceAlerta {
    @Autowired
    private ServiceClima serviceClima;
    @Autowired
    private IRepositoryClima repositoryClima;
    @Autowired
    private IRepositoryCiudad repositoryCiudad;
    @Autowired
    private Validador validador;

    public Mono<Void> analizarClimas() {
        List<Ciudad> ciudades = repositoryCiudad.getAllCiudades();
        List<Clima> climasAnalizar = repositoryClima.getLastsClimas(ciudades);
        climasAnalizar.stream()
                .filter(clima -> clima != null)
                .filter(validador::cumpleCondiciones)
                .forEach(clima -> {
                    System.out.println("Alerta generada para el clima: Temperatura: " + clima.getTemperatura() + "°C, Humedad: " + clima.getHumedad() + "%, Ciudad: " + clima.getCiudad().getNombre());    
                });
        return null;
    }
}
