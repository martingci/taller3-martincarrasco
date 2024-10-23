package org.example;

import static org.junit.jupiter.api.Assertions.*;

class DeporteTest {

    @org.junit.jupiter.api.Test
    void agregarDeportista() {
        Club club = new Club("club");
        Deporte deporte = new Deporte("futbol");
        club.agregarDeporte(deporte);
        Deportista deportista = new Deportista("martin", "perez", "numero1", deporte);
        assertTrue(deporte.agregarDeportista(deportista));
        assertFalse(deporte.agregarDeportista(deportista));
    }

    @org.junit.jupiter.api.Test
    void agregarEntrenador() {
    }

    @org.junit.jupiter.api.Test
    void agregarEquipo() {
    }

    @org.junit.jupiter.api.Test
    void agregarDeportistaAEquipo() {
    }

    @org.junit.jupiter.api.Test
    void agregarEntrenadorAEquipo() {
    }

    @org.junit.jupiter.api.Test
    void agregarPartido() {
    }

    @org.junit.jupiter.api.Test
    void obtenerEquipos() {
    }
}