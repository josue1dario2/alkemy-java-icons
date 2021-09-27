package com.fmalessio.alkemy.icons.dto;

import com.fmalessio.alkemy.icons.entity.PaisEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IconDTO {
    private Long id;
    private String imagen;
    private String denominacion;
    private String fechaCreacion;
    private Long altura;
    private String historia;
    private List<PaisEntity> paises;
}
