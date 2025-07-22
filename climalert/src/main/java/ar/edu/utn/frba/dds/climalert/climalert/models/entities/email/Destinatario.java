package ar.edu.utn.frba.dds.climalert.climalert.models.entities.email;

import lombok.Getter;

@Getter
public class Destinatario {
    private String email;
    private String nombre;

    public Destinatario(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

}
