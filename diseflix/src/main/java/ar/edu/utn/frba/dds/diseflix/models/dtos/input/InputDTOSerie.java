package ar.edu.utn.frba.dds.diseflix.models.dtos.input;

import ar.edu.utn.frba.dds.diseflix.models.entities.Imagen;
import lombok.Data;

@Data
public class InputDTOSerie {
    private String nombre;
    private String resenia;
    private Double duracion;
    private Double tiempoReproducido;
}
