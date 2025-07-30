package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.impuestos.IImpuesto;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.TipoProducto;

import java.util.List;

public class ProductoDeHogar implements TipoProducto {
    private List<IImpuesto> impuestos;

    @Override
    public Double impuestosAplicados(Double precioBase) {
        return impuestos.stream()
                .mapToDouble(impuesto -> impuesto.calcularImpuesto(precioBase))
                .sum();
    }
}