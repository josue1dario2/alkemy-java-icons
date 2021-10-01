package com.fmalessio.alkemy.icons.mapper;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.IconEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class IconMapper {

    @Autowired
    private PaisMapper paisMapper;

    public IconEntity iconDTO2Entity(IconDTO dto) {
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

    public IconDTO iconEntity2DTO(IconEntity entity) {
        IconDTO dto = new IconDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        dto.setFechaCreacion(entity.getFechaCreacion().toString());
        dto.setAltura(entity.getAltura());
        dto.setHistoria(entity.getHistoria());

        List<PaisDTO> paisesDTO = this.paisMapper.paisEntityList2DTOList(entity.getPaises());
        dto.setPaises(paisesDTO);
        return dto;
    }

    private LocalDate String2LocalDate(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }

}
