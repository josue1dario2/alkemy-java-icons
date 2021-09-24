package com.fmalessio.alkemy.icons.entity;

import javax.persistence.*;

@Entity
@Table(name = "`continente`")
public class ContienenteEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

}
