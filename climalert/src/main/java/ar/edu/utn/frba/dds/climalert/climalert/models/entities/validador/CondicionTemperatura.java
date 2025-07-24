package ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import org.springframework.stereotype.Component;

@Component
public class CondicionTemperatura implements ICondicionAlerta {
    private Double temperaturaMaxima = 35.0;

   // public CondicionTemperatura(Double temperaturaMaxima) {
    //    this.temperaturaMaxima = temperaturaMaxima;
    //}

    @Override
    public Boolean cumpleCondicion(Clima clima) {
        return clima.getTemperatura() > temperaturaMaxima;
    }
}
