package com.example.controllers;

import com.example.dao.UsuarioDao;
import com.example.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping("api/usuarios")
    public List<Usuario> getUsuario(){
        List<Usuario> user=usuarioDao.getUsuarios();
        return user;
    }

    @RequestMapping(value = "api/usuarios/{id}",method = RequestMethod.DELETE)
    public void eliminar(@PathVariable long id){
        usuarioDao.eliminar(id);

    }


}
