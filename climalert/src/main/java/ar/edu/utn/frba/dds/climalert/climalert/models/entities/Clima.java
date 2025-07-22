package ar.edu.utn.frba.dds.climalert.climalert.models.entities;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Clima {
    private Double temperatura;
    private Double humedad;
    private String ubicacion;
    private LocalDateTime fechaHora;

    public Clima(Double temperatura, Double humedad, String ubicacion, LocalDateTime fechaHora) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.ubicacion = ubicacion;
        this.fechaHora = fechaHora;
    }
}
