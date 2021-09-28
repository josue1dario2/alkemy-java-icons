package com.fmalessio.alkemy.icons.mapper;

import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.PaisEntity;
import org.springframework.stereotype.Component;

@Component
public class PaisMapper {

    public PaisEntity paisDTO2Entity(PaisDTO dto) {
        PaisEntity entity = new PaisEntity();
        entity.setImagen(dto.getImagen());
        entity.setDenominacion(dto.getDenominacion());
        entity.setCantidadHabitantes(dto.getCantidadHabitantes());
        entity.setContinenteId(dto.getContinenteId());
        entity.setSuperficie(dto.getSuperficie());
        return entity;
    }

}
