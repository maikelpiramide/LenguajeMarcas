package com.example.test;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestUnitariosTest {

    @Test
    void calcularMultiplicacion() {
        TestUnitarios testUnitarios = new TestUnitarios();

        int resultado = testUnitarios.calcularMultiplicacion(2,2);
        assertEquals(4, resultado);
        int resultado2 = testUnitarios.calcularMultiplicacion(-10,3);
        assertEquals(-30, resultado2);
    }

    @Test
    void concatenarCadenas() {
        TestUnitarios testUnitarios = new TestUnitarios();
        String resultado = testUnitarios.concatenarCadenas("hola","mundo");
        assertEquals("holamundo",resultado);
        String resultado2 = testUnitarios.concatenarCadenas("hola","");
        assertEquals("hola",resultado2);
        String resultado3 = testUnitarios.concatenarCadenas("","mundo");
        assertEquals("mundo",resultado3);
        String resultado4 = testUnitarios.concatenarCadenas("","");
        assertEquals("",resultado4);
    }

    @Test
    void esPar() {
        TestUnitarios testUnitarios = new TestUnitarios();
        boolean resultado = testUnitarios.esPar(1);
        assertFalse(resultado);
        boolean resultado3 = testUnitarios.esPar(-5);
        assertFalse(resultado3);
        boolean resultado2 = testUnitarios.esPar(2);
        assertTrue(resultado2);
    }

    @Test
    void convertirAMinusculas() {
        TestUnitarios testUnitarios = new TestUnitarios();
        String resultado = testUnitarios.convertirAMinusculas("HOLA");
        assertEquals("hola",resultado);
        String resultado2 = testUnitarios.convertirAMinusculas("hola");
        assertEquals("hola",resultado2);
        String resultado3 = testUnitarios.convertirAMinusculas("");
        assertEquals("",resultado3);
    }

    @Test
    void contarVocales() {
        TestUnitarios testUnitarios = new TestUnitarios();
        int resultado = testUnitarios.contarVocales("hola");
        assertEquals(2, resultado);

        int resultado2 = testUnitarios.contarVocales("sdf");
        assertEquals(0, resultado2);
        int resultado3 = testUnitarios.contarVocales("");
        assertEquals(0, resultado3);
    }

    @Test
    void esPalindroma() {
        TestUnitarios testUnitarios = new TestUnitarios();

        boolean resultado = testUnitarios.esPalindroma("hola");
        assertFalse(resultado);
        boolean resultado2 = testUnitarios.esPalindroma("pepa");
        assertFalse(resultado2);
        boolean resultado3 = testUnitarios.esPalindroma("rapar");
        assertTrue(resultado3);
    }

    @Test
    void calcularAreaCuadrado() {
        TestUnitarios testUnitarios = new TestUnitarios();
        double resultado = testUnitarios.calcularAreaCuadrado(2);
        assertEquals(4,resultado);
        double resultado2 = testUnitarios.calcularAreaCuadrado(-10);
        assertEquals(0, resultado2);
        double resultado3 = testUnitarios.calcularAreaCuadrado(0);
        assertEquals(0, resultado3);
    }

    @Test
    void calcularHipotenusa() {
        TestUnitarios testUnitarios = new TestUnitarios();
        double resultado = testUnitarios.calcularHipotenusa(1,1);
        assertEquals(1.4142135623730951,resultado);
        double resultado2 = testUnitarios.calcularHipotenusa(0,0);
        assertEquals(0, resultado2);
        double resultado3 = testUnitarios.calcularHipotenusa(0,-1);
        assertEquals(0, resultado3);
    }

    @Test
    void calcularDivision() {
        TestUnitarios testUnitarios = new TestUnitarios();
        double resultado = testUnitarios.calcularDivision(2,2);
        assertEquals(1,resultado);

        assertThrows(IllegalArgumentException.class, ()->{
            testUnitarios.calcularDivision(0,0);
        });
        resultado = testUnitarios.calcularDivision(10,-1);
        assertEquals(-10, resultado);
    }


    @Test
    void encontrarMaximo() {
        TestUnitarios testUnitarios = new TestUnitarios();
        List<Integer> lista = new ArrayList<>();


        Integer resultado = testUnitarios.encontrarMaximo(Arrays.asList(1,3,4,10,5,13));
        assertEquals(13, resultado);

        assertThrows(IllegalArgumentException.class, ()->{
            testUnitarios.encontrarMaximo(null);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            testUnitarios.encontrarMaximo(lista);
        });
    }

    @Test
    void eliminarDuplicados() {
        TestUnitarios testUnitarios = new TestUnitarios();
        List<Integer> lista = Arrays.asList(1,2,3,3,4,5,5,8);
        assertTrue(lista.contains(1));
        assertTrue(lista.contains(2));
        assertTrue(lista.contains(3));
        assertTrue(lista.contains(4));
        assertTrue(lista.contains(5));
        assertTrue(lista.contains(8));
        assertFalse(lista.contains(7));
    }
}