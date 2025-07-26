package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SistemaContableExterno {
    private WebClient webClient;
    private String url;

    public void registrarVentaSistemaExterior(Producto producto){
    //TODO: enlace a la API externa
    }
}
