/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analista.adoo.Controller;

import com.analista.adoo.Entity.Tarea;
import com.analista.adoo.Service.IUsuarioService;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author nahuel
 */
@Controller
public class UsuarioController {
    
    @Autowired
    IUsuarioService serv1;
    
    @GetMapping({"/tareas"})
    public String lista(Map m) throws SQLException{
        
       
       List<Tarea> lista = serv1.buscarTodo();
        m.put("tareas", lista);
       
        
        
        return "tareas";
    }
    
}
