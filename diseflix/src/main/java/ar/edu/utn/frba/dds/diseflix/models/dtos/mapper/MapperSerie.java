package ar.edu.utn.frba.dds.diseflix.models.dtos.mapper;

import ar.edu.utn.frba.dds.diseflix.models.dtos.input.InputDTOSerie;
import ar.edu.utn.frba.dds.diseflix.models.dtos.output.OutputDTOSerie;
import ar.edu.utn.frba.dds.diseflix.models.entities.Serie;

//Se usa mapper manual y no mapStruct para evitar incompatiblidad de tipos pero tranquilamente podria hacerse.
public class MapperSerie {
    public Serie toEntity(InputDTOSerie inputDTOSerie){
        Serie serie = new Serie();
        serie.setNombre(inputDTOSerie.getNombre());
        serie.setResenia(inputDTOSerie.getResenia());
        serie.setDuracion(inputDTOSerie.getDuracion());
        serie.setTiempoReproducido(inputDTOSerie.getTiempoReproducido());
        return serie;
    }

    public OutputDTOSerie toDTO(Serie serie) {
        OutputDTOSerie outputDTOSerie = new OutputDTOSerie();
        outputDTOSerie.setNombre(serie.getNombre());
        outputDTOSerie.setResenia(serie.getResenia());
        outputDTOSerie.setDuracion(serie.getDuracion());
        outputDTOSerie.setTiempoReproducido(serie.getTiempoReproducido());
        return outputDTOSerie;
    }
}
