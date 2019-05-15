/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analista.adoo.Service;

import com.analista.adoo.Entity.Tarea;
import java.util.List;

/**
 *
 * @author nahuel
 */
public interface IUsuarioService {
    
    public List<Tarea> buscarTodo();
    
}
