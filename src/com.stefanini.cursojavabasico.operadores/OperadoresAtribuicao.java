package com.stefanini.cursojavabasico.operadores;

public class OperadoresAtribuicao{
    public static void main(String[] args) {
        int a = 10; // operadores de Atribuição.
        int b = 5;

        a += b; // Aditivo
        a -= b; // Subtrativo
        a *= b; // Multiplicativo
        a /= b; // Divisivo
        a %= b; // Modular

        System.out.println(a %= b);
    }
}