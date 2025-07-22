package ar.edu.utn.frba.dds.diseflix.models.entities;

import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
public class SesionDeReproduccion {
    private LocalDateTime inicio;
    private LocalDateTime fin;

    public SesionDeReproduccion(){
        this.inicio = LocalDateTime.now();
    }


    public void finalizar() {
        this.fin = LocalDateTime.now();
    }


    public Double duracionEnMinutos() {
        if (fin == null) return 0.0;
        return (double) Duration.between(inicio, fin).toMinutes();
    }
}
