package com.fmalessio.alkemy.icons.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "`continente`")
public class ContienenteEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    //@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "continente_id")
    //private List<PaisEntity> continentes = new ArrayList<>();

}
