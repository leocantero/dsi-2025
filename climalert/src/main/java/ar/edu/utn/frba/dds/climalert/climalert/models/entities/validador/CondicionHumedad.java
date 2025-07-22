package ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import org.springframework.stereotype.Component;

@Component
public class CondicionHumedad implements ICondicionAlerta {
    private Double humedadMaxima;

    public CondicionHumedad(Double humedadMaxima) {
        this.humedadMaxima = humedadMaxima;
    }

    @Override
    public Boolean cumpleCondicion(Clima clima) {
        return clima.getHumedad() > humedadMaxima;
    }
}
