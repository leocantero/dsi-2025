package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observables;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.IObserver;

public interface IObservable {
    void agregarObserver(IObserver observador);
    void eliminarObserver(IObserver observador);
    void notificar();
}
