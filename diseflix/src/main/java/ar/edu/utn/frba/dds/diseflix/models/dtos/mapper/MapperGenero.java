package ar.edu.utn.frba.dds.diseflix.models.dtos.mapper;

import ar.edu.utn.frba.dds.diseflix.models.dtos.input.InputDTOGenero;
import ar.edu.utn.frba.dds.diseflix.models.dtos.output.OutputDTOGenero;
import ar.edu.utn.frba.dds.diseflix.models.entities.Genero;

public class MapperGenero {
    public Genero toEntity(InputDTOGenero inputDTOGenero) {
        Genero genero = new Genero();
        genero.setNombre(inputDTOGenero.getNombre());
        return genero;
    }

    public OutputDTOGenero toDto(Genero genero) {
        OutputDTOGenero outputDTOGenero = new OutputDTOGenero();
        outputDTOGenero.setNombre(genero.getNombre());
        return outputDTOGenero;
    }
}
