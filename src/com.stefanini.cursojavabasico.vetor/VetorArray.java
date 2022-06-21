package com.stefanini.cursojavabasico.vetor;

import org.ietf.jgss.Oid;

public class VetorArray {
    public static void main(String[] args) {

        // Matriz
        int[][] matriz = new int[3][4];

        matriz[0][1] = 5;
        matriz[1][3] = 10;
        matriz[2][1] = 15;

        // for
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }

        // for each
        for (int[] i : matriz) {
            for (int j : i) {
                System.out.print(j + " - ");
            }
            System.out.println();
        }

        // Array int
        int[] vetorArray = new int[10];
        vetorArray[0] = 5;
        vetorArray[5] = 9;

        // for
        for (int i = 0; i < vetorArray.length; i++) {
            System.out.println(vetorArray[i]);
        }

        // Array String
        String[] meses = new String[] { "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio" };

        // for each
        for (String mes : meses) {
            System.out.println(mes);
        }

    }
}