package ar.edu.utn.frba.dds.climalert.climalert.models.repositories.impl;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryCiudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryClima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RepositoryClima implements IRepositoryClima {


    private List<Clima> climas = new ArrayList<>();

    @Override
    public Mono<Void> saveClima(Clima clima) {
        climas.add(clima);
        return Mono.empty();
    }

    @Override
    public Clima getLastClima(Ciudad ciudad) {
        return climas.stream()
                        .filter(clima -> clima.getCiudad().equals(ciudad))
                        .max((c1, c2) -> c1.getFechaHora().compareTo(c2.getFechaHora()))
                        .orElse(null);
    }


    @Override
    public List<Clima> getLastsClimas(List<Ciudad> ciudades) {
        return ciudades.stream()
                .map(this::getLastClima)
                .filter(clima -> clima != null) // Filtra los nulos
                .collect(Collectors.toList());
    }

}
