package com.fmalessio.alkemy.icons.builder;

import com.fmalessio.alkemy.icons.entity.ContienenteEntity;

public class ContinenteEntityBuilder {

    private ContienenteEntity contienenteEntity;

    public ContinenteEntityBuilder() {
        this.contienenteEntity = new ContienenteEntity();
    }

    public ContinenteEntityBuilder imagen(String imagen) {
        this.contienenteEntity.setImagen(imagen);
        return this;
    }

    public ContinenteEntityBuilder denominacion(String dominacion) {
        this.contienenteEntity.setDenominacion(dominacion);
        return this;
    }

    public ContienenteEntity build() {
        return contienenteEntity;
    }


}
