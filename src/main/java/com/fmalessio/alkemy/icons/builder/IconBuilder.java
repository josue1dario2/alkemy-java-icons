package com.fmalessio.alkemy.icons.builder;

import com.fmalessio.alkemy.icons.dto.IconDTO;
import com.fmalessio.alkemy.icons.dto.PaisDTO;
import com.fmalessio.alkemy.icons.entity.PaisEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IconBuilder {

    private IconDTO iconDTO;

    public IconBuilder() {
        this.iconDTO = new IconDTO();
    }

    public IconBuilder id(Long id) {
        this.iconDTO.setId(id);
        return this;
    }

    public IconBuilder imagen(String imagen) {
        this.iconDTO.setImagen(imagen);
        return this;
    }

    public IconBuilder denominacion(String denominacion) {
        this.iconDTO.setDenominacion(denominacion);
        return this;
    }

    public IconBuilder fechaCreacion(String fechaCreacion) {
        this.iconDTO.setFechaCreacion(fechaCreacion);
        return this;
    }

    public IconBuilder altura(Long altura) {
        this.iconDTO.setAltura(altura);
        return this;
    }

    public IconBuilder historia(String altura) {
        this.iconDTO.setHistoria(altura);
        return this;
    }

    public IconBuilder paises(List<PaisDTO> paises) {
        this.iconDTO.setPaises(paises);
        return this;
    }

}
