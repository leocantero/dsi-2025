package ar.edu.utn.frba.dds.climalert.climalert.models.repositories.impl;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryCiudad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryCiudad implements IRepositoryCiudad {
    List<Ciudad> ciudades = List.of(new Ciudad("CABA"), new Ciudad("London"));;

    @Override
    public List<Ciudad> getAllCiudades() {
        return ciudades;
    }
}
