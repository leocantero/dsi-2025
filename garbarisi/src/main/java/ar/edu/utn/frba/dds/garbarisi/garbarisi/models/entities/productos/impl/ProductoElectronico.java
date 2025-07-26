package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.TipoProducto;

public class ProductoElectronico implements TipoProducto {
    private List<Impuesto> impuestos;

    @Override
    public Double impuestosAplicados(Double precioBase) {
        return 0.0;
    }
}
