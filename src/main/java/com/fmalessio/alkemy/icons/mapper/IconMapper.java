package com.fmalessio.alkemy.icons.mapper;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;
import com.fmalessio.alkemy.icons.entity.PaisEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
        //entity.setPaises(dto.getPaises());
        return entity;
    }

    public IconDTO IconEntity2DTO(IconEntity entity, List<PaisEntity> paises) {
        IconDTO dto = new IconDTO();
        dto.setAltura(entity.getAltura());
        List<PaisDTO> paises1 = new ArrayList<>();
        PaisDTO a = new PaisDTO();
        a.setDenominacion(paises.get(0).getDenominacion());
        paises1.add(a);
        dto.setPaises(paises1);
        return dto;
    }

    private LocalDate String2LocalDate(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }

}
