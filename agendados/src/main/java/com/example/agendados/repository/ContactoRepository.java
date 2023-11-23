package com.example.agendados.repository;

import com.example.agendados.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Long> {
    List<Contacto> findByNombre(String nombre);
}
