package com.fmalessio.alkemy.icons.entity;

import javax.persistence.*;

@Entity
@Table(name = "`pais`")
public class PaisEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    @Column(name = "cant_habitantes")
    private Long cantidadHabitantes;

    @Column
    private Long superficie; // m2

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id")
    private ContienenteEntity continente;

}
