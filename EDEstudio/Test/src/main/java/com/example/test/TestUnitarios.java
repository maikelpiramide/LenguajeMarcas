package com.example.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestUnitarios {

    public int calcularMultiplicacion(int a, int b) {
        return a * b;
    }

    public String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    public int contarVocales(String cadena) {
        int contador = 0;
        for (char c : cadena.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }


    public boolean esPalindroma(String cadena) {
        String reversa = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(reversa);
    }

    public double calcularAreaCuadrado(double lado)
    {
        double resultado = 0;
        if(lado > 0){
            resultado = lado * lado;
        }

        return resultado;
    }

    public double calcularHipotenusa(int catetoA, int catetoB) {
        double hipotenusa = 0;
        if(catetoA > 0 && catetoB > 0){
            hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        }

        return hipotenusa;
    }


    public double calcularDivision(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return dividendo / divisor;
    }

    public <Integer extends Comparable<Integer>> Integer encontrarMaximo(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        return Collections.max(lista);
    }

    public static <T> List<T> eliminarDuplicados(List<T> lista) {
        Set<T> conjuntoSinDuplicados = new HashSet<>(lista);
        lista.clear();
        lista.addAll(conjuntoSinDuplicados);
        return lista;
    }
}
