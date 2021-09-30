package com.fmalessio.alkemy.icons.mapper;

import com.fmalessio.alkemy.icons.builder.ContinenteEntityBuilder;
import com.fmalessio.alkemy.icons.dto.ContinenteDTO;
import com.fmalessio.alkemy.icons.entity.ContienenteEntity;
import org.springframework.stereotype.Component;

@Component
public class ContinenteMapper {

    public ContienenteEntity continenteDTO2Entity(ContinenteDTO dto) {
        //ContienenteEntity entity = new ContienenteEntity();
        //entity.setImagen(dto.getImagen());
        //entity.setDenominacion(dto.getDenominacion());
        //return entity;

        ContienenteEntity entity = new ContinenteEntityBuilder()
                .imagen(dto.getImagen())
                .denominacion(dto.getDenominacion())
                .build();

        return entity;
    }

}
