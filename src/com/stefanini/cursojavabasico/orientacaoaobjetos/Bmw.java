package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Bmw extends Carro {

    public Bmw() {
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("BMW Sobrescrita");
        return velocidadeFinal / tempoFinal;
    }

}
