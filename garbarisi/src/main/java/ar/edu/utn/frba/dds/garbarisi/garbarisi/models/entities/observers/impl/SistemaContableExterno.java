package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SistemaContableExterno {
    private WebClient webClient;
    @Value("${sistema-contable-externo.url}")
    private String url;

    public void registrarVentaSistemaExterior(Producto producto){
        webClient.post()
                .uri(url + "/ventas")
                .bodyValue(producto)
                .retrieve()
                .bodyToMono(Void.class)
                .block();
    }
    //TODO: mockear como recibe el otro servicio este post
}
