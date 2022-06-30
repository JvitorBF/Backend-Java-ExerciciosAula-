package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n.: Começo da aplicação :."
                + "\n");

        Carro bmw = new Carro();
        bmw.marca = "BMW";
        bmw.modelo = "M3";
        bmw.quilometrosPorLitro = 7.5;
        bmw.taxaAceleracao = 50;
        bmw.velocidadeMaxima = 200;
        System.out.println(bmw.marca);
        System.out.println(bmw.modelo);
        System.out.println(bmw.quilometrosPorLitro);
        System.out.println(bmw.taxaAceleracao);
        System.out.println(bmw.velocidadeMaxima);

        bmw.acelerar();
        bmw.frear();

        System.out.println("\n.: Fim da aplicação :."
                + "\n");

    }
}
