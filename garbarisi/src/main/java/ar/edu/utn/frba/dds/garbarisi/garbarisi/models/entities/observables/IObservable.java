package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observables;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.IObserver;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;

public interface IObservable {
    void agregarObserver(IObserver observador);
    void eliminarObserver(IObserver observador);
    void notificar(Producto producto);
    void vender(Producto producto);
}
