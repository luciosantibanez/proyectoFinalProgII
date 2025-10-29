package com.example.dao;
import com.example.models.Usuario;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

//interface

@Transactional
public interface UsuarioDao {

    List<Usuario> getUsuarios();


    void eliminar (Long id);
    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}

