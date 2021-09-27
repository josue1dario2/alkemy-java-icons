package com.fmalessio.alkemy.icons.builder;

import com.fmalessio.alkemy.icons.dto.IconBasicDTO;

public class IconBasicBuilder {

    private IconBasicDTO iconBasicDTO;

    public IconBasicBuilder() {
        this.iconBasicDTO = new IconBasicDTO();
    }

    public IconBasicBuilder id(Long id) {
        this.iconBasicDTO.setId(id);
        return this;
    }

    public IconBasicBuilder imagen(String imagen) {
        this.iconBasicDTO.setImagen(imagen);
        return this;
    }

    public IconBasicBuilder denominacion(String denominacion) {
        this.iconBasicDTO.setDenominacion(denominacion);
        return this;
    }

}
