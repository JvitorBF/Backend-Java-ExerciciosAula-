package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n.: Começo da aplicação :."
                + "\n");

        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setModelo("M3");
        bmw.setQuilometrosPorLitro(7.5);
        bmw.setVelocidadeMaxima(280);

        Carro mercedes = new Carro("Mercedes", "c180");
        System.out.println(mercedes.getMarca());
        System.out.println(mercedes.getModelo());

        System.out.println(bmw.getMarca());
        System.out.println(bmw.getModelo());
        System.out.println(bmw.getQuilometrosPorLitro());
        System.out.println(bmw.getTaxaAceleracao());
        System.out.println(bmw.getVelocidadeMaxima());

        bmw.acelerar();
        bmw.frear();

        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
        System.out.println(bmw.calcularTaxaAceleracao(100, 5));

        System.out.println("\n.: Fim da aplicação :."
                + "\n");

    }
}
