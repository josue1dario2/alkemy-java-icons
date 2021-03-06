package com.fmalessio.alkemy.icons.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "`icon`")
public class IconEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column
    private Long altura;

    @Column
    private String historia;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "pais_id")
    private PaisEntity pais;

}
