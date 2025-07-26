package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.TipoProducto;

public class ProductoDeHogar implements TipoProducto {
    private List<Impuesto> impuestos;

    @Override
    public Double impuestosAplicados(Double precioBase) {
        // TODO: Implementar la logica de impuestos para productos de hogar
    }
}
