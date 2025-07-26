package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;

public interface IAdapterAPI {
    void registrarVentaSistemaExterno(Producto producto);
}
