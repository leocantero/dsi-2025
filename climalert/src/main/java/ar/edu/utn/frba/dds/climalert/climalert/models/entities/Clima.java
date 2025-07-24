package ar.edu.utn.frba.dds.climalert.climalert.models.entities;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Clima {
    private Double temperatura;
    private Double humedad;
    private Ciudad ciudad;
    private LocalDateTime fechaHora;

    public Clima(Double temperatura, Double humedad, Ciudad ciudad/*,LocalDateTime fechaHora*/) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.ciudad = ciudad;
        //this.fechaHora = fechaHora;
    }
}
