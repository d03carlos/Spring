package com.fidel.prueba.config;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class FidelConfig extends ResourceConfig{
    public FidelConfig() {
        packages("com.fidel.prueba.controller");
    }
}
