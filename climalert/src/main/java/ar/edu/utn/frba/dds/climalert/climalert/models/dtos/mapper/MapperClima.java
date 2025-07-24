package ar.edu.utn.frba.dds.climalert.climalert.models.dtos.mapper;

import ar.edu.utn.frba.dds.climalert.climalert.models.dtos.response.ClimaResponseDTO;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;

import java.time.LocalDateTime;

public class MapperClima {
    public Clima responseToEntity(ClimaResponseDTO climaResponseDTO){
        return new Clima(
                climaResponseDTO.getCurrent().getTemp_c(),
                climaResponseDTO.getCurrent().getHumidity(),
                new Ciudad(climaResponseDTO.getLocation().getName())/*,
                climaResponseDTO.getLocation().getLocaltime()*/
        );
    }
}
