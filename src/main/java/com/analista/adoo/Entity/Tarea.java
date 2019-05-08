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
    @Column (name = "descrips")
    private String descripcion;
    @Column (name = "fecha")
    private String fecha;
    
    @ManyToOne
    @JoinColumn(name = "id_tareas", referencedColumnName = "id")
    private Tarea tareas;

    public Tarea getTareas() {
        return tareas;
    }

    public void setTareas(Tarea tareas) {
        this.tareas = tareas;
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
