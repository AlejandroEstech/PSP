package com.example.encuesta.repository;

import com.example.encuesta.model.Aficion;
import com.example.encuesta.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario,Long> {

}
