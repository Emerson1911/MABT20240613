package OperacionesMatematicasMABT;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MABTTest {

    @Test
    void setUp() {
    }

    @Test
    void tearDown() {
    }

    @Test
    void calcularRaizCuadrada() {
        MABT operaciones = new MABT();

        // Caso de prueba: número positivo
        assertEquals(2.0, operaciones.calcularRaizCuadrada(4.0), 0.0001);

        // Caso de prueba: cero
        assertEquals(0.0, operaciones.calcularRaizCuadrada(0.0), 0.0001);

        // Caso de prueba: número negativo (debe lanzar una excepción)
        assertThrows(IllegalArgumentException.class, () -> {
            operaciones.calcularRaizCuadrada(-1.0);
        });
    }
}