package com.fmalessio.alkemy.icons.mapper;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class IconMapper {

    public IconEntity IconDTO2Entity(IconDTO dto) {
        IconEntity entity = new IconEntity();
        entity.setImagen(dto.getImagen());
        entity.setDenominacion(dto.getDenominacion());
        entity.setFechaCreacion(
                this.String2LocalDate(dto.getFechaCreacion())
        );
        entity.setAltura(dto.getAltura());
        entity.setHistoria(dto.getHistoria());
        entity.setPaises(dto.getPaises());
        return entity;
    }

    public IconDTO IconEntity2DTO(IconEntity entity) {
        IconDTO dto = new IconDTO();
        dto.setAltura(entity.getAltura());
        return dto;
    }

    private LocalDate String2LocalDate(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }

}
