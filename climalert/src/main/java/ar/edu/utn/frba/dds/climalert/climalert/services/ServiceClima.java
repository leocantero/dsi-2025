package ar.edu.utn.frba.dds.climalert.climalert.services;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ubicacion;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryClima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ServiceClima {
    @Autowired
    private IRepositoryClima repositoryClima;
    private List<Ubicacion> ubicaciones;


    public void saveClima(Clima clima){
        repositoryClima.saveClima(clima);
    }

    public Mono<Void> actualizarClimas(){
        //TODO
        return null;
    }
}
