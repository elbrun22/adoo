/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analista.adoo.Dao;

import com.analista.adoo.Entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nahuel
 */
public interface IUsuarioDao extends JpaRepository<Tarea, Integer>{
    
}
