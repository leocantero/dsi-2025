package ar.edu.utn.frba.dds.diseflix.services;

import ar.edu.utn.frba.dds.diseflix.models.dtos.input.InputDTOSerie;
import ar.edu.utn.frba.dds.diseflix.models.dtos.mapper.MapperSerie;
import ar.edu.utn.frba.dds.diseflix.models.dtos.output.OutputDTOSerie;
import ar.edu.utn.frba.dds.diseflix.models.entities.Serie;
import ar.edu.utn.frba.dds.diseflix.repositories.IRepositorySerie;
import ar.edu.utn.frba.dds.diseflix.repositories.impl.RepositorySerie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ServiceSerie {
    @Autowired
    private IRepositorySerie repositorySerie;
    private MapperSerie mapperSerie = new MapperSerie();

    public List<OutputDTOSerie> obtenerTodasLasSeries() {
        return repositorySerie.getAllSeries().stream()
                .map(mapperSerie::toDTO)
                .collect(Collectors.toList());
    }

    public void reproducir(UUID idSerie) {
        Serie serie = repositorySerie.getSerieById(idSerie);
        if(serie !=  null) serie.reproducir();
    }

    public void pausar(UUID idSerie){
        Serie serie = repositorySerie.getSerieById(idSerie);
        if(serie != null){
            serie.pausar();
            repositorySerie.updateSerie(serie);
        }
    }

    public void agregar(InputDTOSerie inputDTOSerie){
        Serie serie = mapperSerie.toEntity(inputDTOSerie);
        repositorySerie.addSerie(serie);
    }

    public void eliminar(UUID id){
        repositorySerie.deleteSerie(id);
    }

    public void actualizar(InputDTOSerie inputDTOSerie, UUID id){
        Serie serieExistente = repositorySerie.getSerieById(id);

        Serie serieActualizada = mapperSerie.toEntity(inputDTOSerie);
        serieActualizada.setId(id); // importante

        repositorySerie.updateSerie(serieActualizada);
    }


}
