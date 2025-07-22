package ar.edu.utn.frba.dds.diseflix.models.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class Genero {
    private UUID id;
    private String nombre;
}