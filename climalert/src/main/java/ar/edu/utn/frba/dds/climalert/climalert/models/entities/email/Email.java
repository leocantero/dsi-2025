package ar.edu.utn.frba.dds.climalert.climalert.models.entities.email;

import lombok.Getter;

import java.util.List;

@Getter
public class Email {
    private List<Destinatario> destinatario;
    private String asunto;
    private String mensaje;

    public Email(List<Destinatario> destinatarios, String asunto, String mensaje){
        this.destinatario = destinatarios;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

}
