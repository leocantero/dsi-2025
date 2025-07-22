package ar.edu.utn.frba.dds.diseflix.controllers;

import ar.edu.utn.frba.dds.diseflix.models.dtos.input.InputDTOSerie;
import ar.edu.utn.frba.dds.diseflix.models.dtos.output.OutputDTOSerie;
import ar.edu.utn.frba.dds.diseflix.services.ServiceSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/series/")
public class ControllerSerie {
    @Autowired
    private ServiceSerie serviceSerie;

    @PostMapping("{id}/reproducir")
    public void reproducirSerie(@PathVariable UUID id) {
        serviceSerie.reproducir(id);
    }

    @PostMapping("{id}/pausar")
    public void pausarSerie(@PathVariable UUID id) {
        serviceSerie.pausar(id);
    }

    @GetMapping("series")
    public List<OutputDTOSerie> obtenerSeries() {
        return serviceSerie.obtenerTodasLasSeries();
    }


}
