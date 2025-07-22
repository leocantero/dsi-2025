package ar.edu.utn.frba.dds.diseflix.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Serie {
    private UUID id;
    private String nombre;
    private Imagen portada;
    private Genero genero;
    private String resenia;
    private Double duracion;
    private Double tiempoReproducido;
    private List<SesionDeReproduccion> sesiones ;

     public Serie(String nombre, Imagen imagen , Genero genero , String resenia, Double duracion) {
         this.nombre = nombre;
         this.portada = imagen;
         this.genero = genero;
         this.resenia = resenia;
         this.duracion = duracion;

         this.id= UUID.randomUUID();
         this.sesiones= new ArrayList<>();
         this.tiempoReproducido = 0.0;
     }

    public void reproducir(){
         sesiones.add(new SesionDeReproduccion());
    }

    public void pausar(){
         SesionDeReproduccion ultimaSesion = this.ultimaSeccionActiva();
         if( ultimaSesion == null){
             throw new IllegalArgumentException("No hay sesiones activas");
         }

         ultimaSesion.finalizar();

         this.tiempoReproducido += ultimaSesion.duracionEnMinutos();
    }

    public SesionDeReproduccion ultimaSeccionActiva(){
         return sesiones.stream()
                 .filter(sesion -> sesion.getFin() == null)
                 .reduce((sesion1, sesion2) -> sesion2)
                 .orElse(null);
    }
}