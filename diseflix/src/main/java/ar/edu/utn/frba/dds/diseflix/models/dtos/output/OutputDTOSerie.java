package ar.edu.utn.frba.dds.diseflix.models.dtos.output;

import lombok.Data;

@Data
public class OutputDTOSerie {
    private String nombre;
    private String resenia;
    private Double duracion;
    private Double tiempoReproducido;
}
