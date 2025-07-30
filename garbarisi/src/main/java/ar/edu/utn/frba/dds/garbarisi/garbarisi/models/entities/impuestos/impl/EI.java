package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.IImpuesto;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
public class EI implements IImpuesto {
    @Value("${gananciaImpositiva.ei}")
    private Double gananciaImpositiva;

    @Override
    public Double calcularImpuesto(Double precioBase) {
        return (precioBase / 4) + 0.3 * gananciaImpositiva;
    }
}
