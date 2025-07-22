package ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Validador {
    private List<ICondicionAlerta> condiciones;

    public Validador(List<ICondicionAlerta> condiciones) {
        this.condiciones = condiciones;
    }

    public Boolean cumpleCondiciones(Clima clima){
        return condiciones.stream()
                .allMatch(condicion -> condicion.cumpleCondicion(clima));
    }
}
