package ar.edu.utn.frba.dds.diseflix.services;

import ar.edu.utn.frba.dds.diseflix.models.dtos.input.InputDTOGenero;
import ar.edu.utn.frba.dds.diseflix.models.dtos.mapper.MapperGenero;
import ar.edu.utn.frba.dds.diseflix.models.entities.Genero;
import ar.edu.utn.frba.dds.diseflix.repositories.IRepositoryGenero;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class ServiceGenero {
    @Autowired
    private IRepositoryGenero repositoryGenero;

    private MapperGenero mapperGenero = new MapperGenero();

    public void cambiarNombre(Genero genero,String nuevoNombre){
        genero.setNombre(nuevoNombre);
    }

    public void agregar(InputDTOGenero inputDTOGenero){
        Genero genero = mapperGenero.toEntity(inputDTOGenero);
        this.repositoryGenero.addGenero(genero);
    }

    public void eliminar(UUID id) {
        this.repositoryGenero.deleteGenero(id);
    }

    public void actualizar(InputDTOGenero inputDTOGenero, UUID id) {
        Genero generoExistente = this.repositoryGenero.getGeneroById(id);
        Genero generoActualizado = mapperGenero.toEntity(inputDTOGenero);
        generoActualizado.setId(id);
        repositoryGenero.updateGenero(generoActualizado);
    }
}
