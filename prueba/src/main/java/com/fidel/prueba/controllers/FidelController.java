package com.fidel.prueba.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidel.prueba.services.PersonaServce;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import com.fidel.prueba.model.Persona;

@RestController
public class FidelController {
    private PersonaServce personaServices;
    
    public FidelController(PersonaServce personaServices) {
        this.personaServices = personaServices;
        this.personaServices.add(new Persona("Hella"));
        this.personaServices.add(new Persona("Faina Bona"));
        this.personaServices.add(new Persona("Bobbie"));
        this.personaServices.add(new Persona("Jana Cova"));
    }
    
    @GetMapping("/personas")
    public List<Persona> getPersonas() {
        return personaServices.getAll();
    }
    @PostMapping("/personas")
    @Produces("application/json")
    @Consumes("application/json")
    public Response addPersona(Persona persona) {
        personaServices.add(persona);
        return Response.created(URI.create("/personas/"+persona.getNombre())).build();
    }
}
