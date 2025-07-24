package ar.edu.utn.frba.dds.climalert.climalert.models.entities.adapters;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import reactor.core.publisher.Mono;

public interface IAdapterAPI {
    Mono<Clima> obtenerClima(Ciudad ciudad);
}
