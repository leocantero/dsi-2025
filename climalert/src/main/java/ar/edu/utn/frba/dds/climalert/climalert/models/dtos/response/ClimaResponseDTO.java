package ar.edu.utn.frba.dds.climalert.climalert.models.dtos.response;

import lombok.Data;

@Data
public class ClimaResponseDTO {
    LocationDTO location;
    CurrentDTO current;
}
