package com.fmalessio.alkemy.icons.mapper;

import com.fmalessio.alkemy.icons.builder.ContinenteEntityBuilder;
import com.fmalessio.alkemy.icons.dto.ContinenteDTO;
import com.fmalessio.alkemy.icons.entity.ContienenteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public ContinenteDTO continenteEntity2DTO(ContienenteEntity entity) {
        ContinenteDTO dto = new ContinenteDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        return dto;
    }

    public List<ContinenteDTO> continenteEntityList2DTOList(List<ContienenteEntity> entities) {
        List<ContinenteDTO> dtos = new ArrayList<>();
        for (ContienenteEntity entity : entities) {
            dtos.add(this.continenteEntity2DTO(entity));
        }
        return dtos;
    }
}
