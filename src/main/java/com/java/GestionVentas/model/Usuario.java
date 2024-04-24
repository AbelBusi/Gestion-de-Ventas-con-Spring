package com.java.GestionVentas.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(length = 100)
    private String nombreUsuario;

    @Column(length = 12)
    private String correoUsuario;

    @Column(length = 50)
    private String passwordUsuario;

    @Column(length = 12)
    private String tipoUsuario;

    @Column(length = 20)
    private String rolUsuario;

    @PrePersist
    protected void onCreate(){
        if (this.tipoUsuario==null){
            this.tipoUsuario="activo";
        }
    }

}
