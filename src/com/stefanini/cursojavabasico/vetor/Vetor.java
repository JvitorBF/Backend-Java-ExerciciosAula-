package com.stefanini.cursojavabasico.vetor;

public class Vetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        vetor[0] = 1;
        vetor[2] = 5;
        vetor[6] = 9;
        vetor[4] = 2;
        vetor[1] = 4;
        vetor[9] = 7;
        vetor[7] = 8;

        String[] carros = new String[] { "BMW", "MERCEDES", "FIAT", "LAMBORGHINI", "MCLAREN" };

        for (String carro : carros) {
            System.out.println(carro);
        }

        // for (int i = 0; i < vetor.length; i++) {
        // System.out.println("vetor[" + i + " = " + vetor[i]);
        // }
    }

}
