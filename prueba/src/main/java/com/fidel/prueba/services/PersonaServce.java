package com.fidel.prueba.services;
import com.fidel.prueba.model.Persona;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServce {
    private List<Persona> personas = new ArrayList<>();
    public List<Persona> getAll(){
        return personas;
    }
    public void add(Persona persona){
        personas.add(persona);
    }
}
