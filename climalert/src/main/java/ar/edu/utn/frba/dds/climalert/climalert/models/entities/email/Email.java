package ar.edu.utn.frba.dds.climalert.climalert.models.entities.email;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Alerta;
import lombok.Getter;

import java.util.List;

@Getter
public class Email {
    private List<Destinatario> destinatario;
    private String asunto;
    private String mensaje;
    private Alerta alertaAsociada;

    public Email(List<Destinatario> destinatarios, String asunto, String mensaje){
        this.destinatario = destinatarios;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

}
