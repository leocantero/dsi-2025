package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos;


import lombok.Getter;

@Getter
public class Producto {
    private String nombre;
    private TipoProducto tipoProducto;
    private Double precioBase;

    public Double precioFinal() {
        return this.tipoProducto.calcularPrecioFinal(this.precioBase);
    }
}
