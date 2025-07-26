package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.IImpuesto;

public class IVA implements IImpuesto {
    private Double gananciaImpositiva;



    @Override
    public Double calcularImpuesto(Double precioBase) {
        // TODO: Implementar la logica de calculo del IVA
        return 0.0;
    }
}
