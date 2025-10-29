package com.example.controllers;

import com.example.dao.UsuarioDao;
import com.example.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "api/usuarios",method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){

        usuarioDao.registrar(usuario);

    }

//    @RequestMapping(value = "api/login", method = RequestMethod.POST)
//    public Map<String, String> iniciarSesion(@RequestBody Usuario usuario) {
//        Map<String, String> response = new HashMap<>();
//        response.put("status", "ok");
//        response.put("email", usuario.getEmail());
//        response.put("password", usuario.getPassword());
//        return response;
//    }



}
