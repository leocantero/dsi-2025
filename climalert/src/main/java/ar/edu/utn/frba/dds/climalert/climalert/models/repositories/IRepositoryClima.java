package ar.edu.utn.frba.dds.climalert.climalert.models.repositories;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

public interface IRepositoryClima {
    Clima getLastClima(Ciudad ciudad);
    List<Clima> getLastsClimas(List<Ciudad> ciudades);
    Mono<Void> saveClima(Clima clima);
}
