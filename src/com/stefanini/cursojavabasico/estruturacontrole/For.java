package com.stefanini.cursojavabasico.estruturacontrole;

public class For {
    public static void main(String[] args) {

        // for normal
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        // for apenas com condição
        int i = 0;

        for (; i < 100;) {
            System.out.println(i);
            i++;
        }

        // for loop infinito
        for (;;) {
            System.out.println("loop infinito");
        }

    }
}
