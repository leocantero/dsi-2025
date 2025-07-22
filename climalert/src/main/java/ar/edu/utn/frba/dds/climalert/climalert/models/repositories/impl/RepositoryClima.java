package ar.edu.utn.frba.dds.climalert.climalert.models.repositories.impl;

import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Clima;
import ar.edu.utn.frba.dds.climalert.climalert.models.entities.Ubicacion;
import ar.edu.utn.frba.dds.climalert.climalert.models.repositories.IRepositoryClima;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryClima implements IRepositoryClima {
    private List<Clima> climas;

    @Override
    public void saveClima(Clima clima) {
        climas.add(clima);
    }

    @Override
    public Clima getLastClima(Ubicacion ubicacion) {
        return climas.stream()
                        .filter(clima -> clima.getUbicacion().equals(ubicacion))
                        .max((c1, c2) -> c1.getFechaHora().compareTo(c2.getFechaHora()))
                        .orElse(null);
    }
}
