package ar.edu.utn.frba.dds.climalert.climalert.models.dtos.response;

import lombok.Data;

@Data
public class CurrentDTO {
    private Double temp_c;
    private Double humidity;
}
