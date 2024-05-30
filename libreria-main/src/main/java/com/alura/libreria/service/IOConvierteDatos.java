package com.alura.libreria.service;

public interface IOConvierteDatos {
        <T> T obtenerDatos(String json, Class<T> clase);
    }
