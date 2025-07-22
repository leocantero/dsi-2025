package ar.edu.utn.frba.dds.diseflix.repositories;

import ar.edu.utn.frba.dds.diseflix.models.entities.Genero;

import java.util.UUID;

public interface IRepositoryGenero {
    void addGenero(Genero genero);
    void deleteGenero(UUID id);
    void updateGenero(Genero genero);
    Genero getGeneroById(UUID id);
}
