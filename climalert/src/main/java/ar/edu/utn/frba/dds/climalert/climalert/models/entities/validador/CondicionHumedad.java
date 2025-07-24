package ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import org.springframework.stereotype.Component;

@Component
public class CondicionHumedad implements ICondicionAlerta {
    private Double humedadMaxima = 70.0;

    @Override
    public Boolean cumpleCondicion(Clima clima) {
        if (clima == null) {
            throw new IllegalArgumentException("El clima no puede ser nulo");
        }
        return clima.getHumedad() > humedadMaxima;
    }
}
