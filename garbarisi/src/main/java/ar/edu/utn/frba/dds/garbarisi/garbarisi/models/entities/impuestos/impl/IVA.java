package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.IImpuesto;

public class IVA implements IImpuesto {
    private Double gananciaImpositiva;
    private Double porcentajeIva;


    @Override
    public Double calcularImpuesto(Double precioBase) {
        return porcentajeIva * precioBase;
    }
}
