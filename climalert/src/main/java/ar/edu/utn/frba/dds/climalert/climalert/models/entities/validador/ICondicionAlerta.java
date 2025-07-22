package ar.edu.utn.frba.dds.climalert.climalert.models.entities.validador;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;

public interface ICondicionAlerta {
    Boolean cumpleCondicion(Clima clima);
}
