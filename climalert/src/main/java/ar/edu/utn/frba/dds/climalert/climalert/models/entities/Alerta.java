package ar.edu.utn.frba.dds.climalert.climalert.models.entities;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Alerta {
    private LocalDateTime fecha;
    private Clima clima;

    public Alerta(Clima clima, LocalDateTime fecha) {
        this.clima = clima;
        this.fecha = fecha;
    }
}
