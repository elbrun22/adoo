/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analista.adoo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author nahuel
 */
@Entity
@Table (name = "tareas")
public class Tarea {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column (name = "descrip")
    private String descripcion;
    @Column (name = "fecha")
    private String fecha;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuarios;

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
