package com.example.agendados.service;

import com.example.agendados.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {

    @Autowired
    private ContactoRepository agendaRepository;


}
