package ar.edu.utn.frba.dds.climalert.climalert.models.entities;

import lombok.Getter;

@Getter
public class Ciudad {
    private String nombre;

    public Ciudad (String nombre) {
        this.nombre = nombre;
    }
}
