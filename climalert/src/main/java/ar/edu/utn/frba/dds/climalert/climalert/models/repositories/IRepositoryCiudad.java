package ar.edu.utn.frba.dds.climalert.climalert.models.repositories;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;

import java.util.List;

public interface IRepositoryCiudad {
    List<Ciudad> getAllCiudades();
}
