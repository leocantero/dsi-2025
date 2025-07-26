package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;

public interface IObserver {

    void serNotificado(Producto producto);
}
