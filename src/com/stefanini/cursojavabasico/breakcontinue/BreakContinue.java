package com.stefanini.cursojavabasico.breakcontinue;

public class BreakContinue {
    public static void main(String[] args) {
        String[] carros = new String[] { "bmw i320", "Mercedes c180", "Mercedes AMG", "Tesla Model S" };

        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == "bmw i320") {
                System.out.println(carros[i]);
                continue;
            }
            System.out.println("Quero esse carro");
            System.out.println(carros[i]);
        }
    }
}
