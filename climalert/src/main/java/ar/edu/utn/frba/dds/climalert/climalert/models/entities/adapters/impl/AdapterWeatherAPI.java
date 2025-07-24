package ar.edu.utn.frba.dds.climalert.climalert.models.entities.adapters.impl;

import ar.edu.utn.frba.dds.climalert.climalert.models.dtos.mapper.MapperClima;
import ar.edu.utn.frba.dds.climalert.climalert.models.dtos.response.ClimaResponseDTO;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ciudad;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.adapters.IAdapterAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class AdapterWeatherAPI implements IAdapterAPI {
    @Value("{$app.base-url}")
    private String url = "http://api.weatherapi.com/v1/";
    private String apiKey = "0e7016d6aef548e5868223804252307";
    private WebClient webClient;
    private MapperClima mapperClima = new MapperClima();

    public AdapterWeatherAPI() {
        this.webClient = WebClient.builder()
            .baseUrl(this.url)
            .build();
    }

    @Override
    public Mono<Clima> obtenerClima(Ciudad ciudad) {
        return webClient.get()
            .uri(uriBuilder -> uriBuilder
                .path("/current.json")
                .queryParam("key", apiKey)
                .queryParam("q", ciudad.getNombre())
                .queryParam("aqi", "no")
                .build())
                .retrieve()
            .bodyToMono(ClimaResponseDTO.class)
            .map(mapperClima::responseToEntity);
    }
}
