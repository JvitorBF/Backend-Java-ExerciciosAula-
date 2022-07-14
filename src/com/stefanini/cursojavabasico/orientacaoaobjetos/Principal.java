package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n.: Começo da aplicação :."
                + "\n");

        /*
         * Carro bmw = new Carro();
         * bmw.setMarca("BMW");
         * bmw.setModelo("M3");
         * bmw.setQuilometrosPorLitro(7.5);
         */

        /*
         * try {
         * bmw.setVelocidadeMaxima(10);
         * } catch (NegocioException e) {
         * System.out.println(e);
         * } finally {
         * System.out.println("Passou no try!");
         * }
         */

        // Carro mercedes = new Carro("Mercedes", "c180");

        Bmw bmwDois = new Bmw();
        bmwDois.piscarAlerta();
        Tesla tesla = new Tesla();

        Carro teslaDois = new Tesla();
        ((Tesla) teslaDois).setDirigeSozinho(true);
        System.out.println(((Tesla) teslaDois).isDirigeSozinho());
        teslaDois.piscarAlerta();
        Carro[] carros = new Carro[] { bmwDois, tesla, teslaDois };

        for (Carro carro : carros) {
            if (carro instanceof Tesla) {
                System.out.println(((Tesla) carro).isDirigeSozinho());
            }
        }

        bmwDois.calcularTaxaAceleracao(100.50, 100);
        teslaDois.calcularTaxaAceleracao(100.50, 10);

        /*
         * System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
         * 
         * System.out.println(mercedes.getMarca());
         * System.out.println(mercedes.getModelo());
         * 
         * System.out.println(bmw.getMarca());
         * System.out.println(bmw.getModelo());
         * System.out.println(bmw.getQuilometrosPorLitro());
         * System.out.println(bmw.getTaxaAceleracao());
         * System.out.println(bmw.getVelocidadeMaxima());
         * 
         * bmw.acelerar();
         * bmw.frear();
         * 
         * System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0,
         * 10, 0));
         * System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
         * System.out.println(bmw.calcularTaxaAceleracao(100, 5));
         * 
         * System.out.println("\n.: Fim da aplicação :."
         * + "\n");
         */
    }
}
