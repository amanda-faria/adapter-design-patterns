package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {
    @Test
    void deveRetornarConceitoRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setCritica("A");

        assertEquals("A", restaurante.getCritica());
    }

    @Test
    void deveRetornarNotaRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setCritica("A");

        assertEquals(9.0f, restaurante.getNota());
    }


}