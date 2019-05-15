/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analista.adoo.Service;

import com.analista.adoo.Dao.IUsuarioDao;
import com.analista.adoo.Entity.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nahuel
 */
@Service
public class IUsuarioServiceImpl implements IUsuarioService{

    @Autowired
    IUsuarioDao dao;
    
    @Override
    public List<Tarea> buscarTodo() {
        return (List<Tarea>) dao.findAll();
    }
    
    
    
}
