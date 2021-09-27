package com.fmalessio.alkemy.icons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`pais`")
@Getter
@Setter
public class PaisEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denominacion;

    @Column(name = "cant_habitantes")
    private Long cantidadHabitantes;

    private Long superficie; // m2

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id")
    private ContienenteEntity continente;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "icon_pais",
            joinColumns = @JoinColumn(name = "pais_id"),
            inverseJoinColumns = @JoinColumn(name = "icon_id"))
    private List<IconEntity> icons = new ArrayList<>();

}
