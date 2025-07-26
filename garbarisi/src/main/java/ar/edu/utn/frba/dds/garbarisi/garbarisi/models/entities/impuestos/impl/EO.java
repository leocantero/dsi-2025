package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.IImpuesto;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
public class EO implements IImpuesto {
    @Value("${gananciaImpositiva.eo}")
    private Double gananciaImpositiva;

    @Override
    public Double calcularImpuesto(Double precioBase) {
        // TODO: Implementar la logica de calculo del impuesto especial sobre operaciones (EO)
        return 0.0;
    }
}
