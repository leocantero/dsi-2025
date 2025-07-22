package ar.edu.utn.frba.dds.diseflix.controllers;

import ar.edu.utn.frba.dds.diseflix.models.dtos.input.InputDTOGenero;
import ar.edu.utn.frba.dds.diseflix.services.ServiceGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/generos/")
public class ControllerGenero {
    @Autowired
    private ServiceGenero serviceGenero;

    @PutMapping("{id}/actualizar")
    public void actualizarGenero(@PathVariable UUID id, InputDTOGenero inputDTOGenero) {
        this.serviceGenero.actualizar(inputDTOGenero, id);
    }

    @PostMapping("crear")
    public void crearGenero(InputDTOGenero inputDTOGenero) {
         this.serviceGenero.agregar(inputDTOGenero);
    }

    @DeleteMapping("{id}/eliminar")
    public void eliminarGenero(@PathVariable UUID id) {
        this.serviceGenero.eliminar(id);
    }
}
