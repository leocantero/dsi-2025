package ar.edu.utn.frba.dds.diseflix.repositories.impl;

import ar.edu.utn.frba.dds.diseflix.models.entities.Genero;
import ar.edu.utn.frba.dds.diseflix.repositories.IRepositoryGenero;

import java.util.List;
import java.util.UUID;

public class RepositoryGenero implements IRepositoryGenero {
    List<Genero> generos;

    @Override
    public void addGenero(Genero genero) {
        this.generos.add(genero);
    }

    @Override
    public void deleteGenero(UUID id){
        generos.removeIf(g -> g.getId().equals(id));
    }

    @Override
    public void updateGenero(Genero genero) {
        deleteGenero(genero.getId());
        addGenero(genero);
    }

    @Override
    public Genero getGeneroById(UUID id) {
        return generos.stream()
                .filter(genero -> genero.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
