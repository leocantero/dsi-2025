package ar.edu.utn.frba.dds.climalert.climalert.models.repositories;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ubicacion;

import java.util.UUID;

public interface IRepositoryClima {
    Clima getLastClima(Ubicacion ubicacion);
    void saveClima(Clima clima);
}
