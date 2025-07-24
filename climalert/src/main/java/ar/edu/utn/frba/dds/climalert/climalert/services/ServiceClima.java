package ar.edu.utn.frba.dds.climalert.climalert.services;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.adapters.IAdapterAPI;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryCiudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryClima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ServiceClima {
    @Autowired
    private IRepositoryClima repositoryClima;
    @Autowired
    private IRepositoryCiudad repositoryCiudad;

    @Autowired
    private IAdapterAPI adapterAPI;

    private static final Logger logger = Logger.getLogger(ServiceClima.class.getName());

    public Mono<Void> actualizarClimas(){
        List<Ciudad> ciudades = repositoryCiudad.getAllCiudades();
        return Flux.fromIterable(ciudades)
                .flatMap(ciudad -> adapterAPI.obtenerClima(ciudad)
                .doOnNext(clima -> logger.info("Clima actualizado: Temp: " + clima.getTemperatura() + "°C, Humedad: " + clima.getHumedad() + "%"))
                .flatMap(clima -> repositoryClima.saveClima(clima)))
                .doOnNext(c -> logger.info("EL CLIMA SE GUARDO CORRECTAMENTE"))
                .then();
    }
}
