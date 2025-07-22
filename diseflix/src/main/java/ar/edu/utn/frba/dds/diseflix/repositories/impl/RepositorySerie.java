package ar.edu.utn.frba.dds.diseflix.repositories.impl;

import ar.edu.utn.frba.dds.diseflix.models.entities.Serie;
import ar.edu.utn.frba.dds.diseflix.repositories.IRepositorySerie;

import java.util.List;
import java.util.UUID;

public class RepositorySerie implements IRepositorySerie {
    private List<Serie> series;

    @Override
    public Serie getSerieById(UUID id) {
        return series.stream()
                .filter(serie -> serie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void addSerie(Serie serie){
        series.add(serie);
    }

    @Override
    public void deleteSerie(UUID id){
        series.removeIf(serie -> serie.getId().equals(id));
    }

    @Override
    public void updateSerie(Serie serie) {
        deleteSerie(serie.getId());
        addSerie(serie);
    }

    @Override
    public List<Serie> getAllSeries(){
        return series;
    }
}