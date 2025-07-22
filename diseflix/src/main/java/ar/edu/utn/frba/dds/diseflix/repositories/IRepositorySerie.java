package ar.edu.utn.frba.dds.diseflix.repositories;

import ar.edu.utn.frba.dds.diseflix.models.entities.Serie;

import java.util.List;
import java.util.UUID;

public interface IRepositorySerie {
    Serie getSerieById(UUID id);
    void addSerie(Serie serie);
    void deleteSerie(UUID id);
    void updateSerie(Serie serie);
    List<Serie> getAllSeries();
}
