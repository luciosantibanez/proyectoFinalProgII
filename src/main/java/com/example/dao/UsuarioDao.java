package com.example.dao;
import com.example.models.Usuario;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

//interface

@Transactional
public interface UsuarioDao {
    List<Usuario> obtenerUsuarios();
}

