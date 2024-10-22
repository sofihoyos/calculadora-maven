package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3), "El resultado de la suma es de: 5");
        assertEquals(0, calculadora.sumar(-1, 1), "El resultado de la suma es de: 0");
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.restar(5, 4), "El resultado de la resta es de: 1");
        assertEquals(-2, calculadora.restar(3, 5), "El resultado de la resta es de: -2");
    }
}
