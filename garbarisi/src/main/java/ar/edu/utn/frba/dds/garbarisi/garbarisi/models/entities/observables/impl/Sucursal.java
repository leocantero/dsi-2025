package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observables.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observables.IObservable;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.IObserver;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;

import java.util.List;

public class Sucursal implements IObservable {
    private List<IObserver> observers;

    @Override
    public void agregarObserver(IObserver observador) {
        observers.add(observador);

    }

    @Override
    public void eliminarObserver(IObserver observador) {
        observers.add(observador);
    }

    @Override
    public void notificar(Producto producto) {
        observers.forEach(observer ->
            observer.serNotificado(producto));
    }

    @Override
    public void vender(Producto producto) {
        // Lógica de venta del producto
        this.notificar(producto);
    }
}