package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Bmw extends Carro implements Esportivo, Utilitario {

    public Bmw() {
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("BMW Sobrescrita");
        return velocidadeFinal / tempoFinal;
    }

    @Override
    public void piscarAlerta() {
        System.out.println("BMW piscando o alerta...");
    }

    @Override
    public void passear() {
        // TODO Auto-generated method stub

    }

    @Override
    public void acionarTurbo() {
        // TODO Auto-generated method stub

    }

}
