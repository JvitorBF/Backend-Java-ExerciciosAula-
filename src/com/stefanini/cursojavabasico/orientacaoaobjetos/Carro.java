package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Carro {

    /*
     * Modificadores de acesso
     * default => Acessível para a própria classe ou classe do mesmo pacote. Não é
     * uma palavra reservada.
     * public => Acessível para a própria classe, classe do mesmo pacote, subclasses
     * (extends) e todas as demais classes.
     * private => Acessível para a própria classe.
     * protected => Acessível para a própria classe, classe do mesmo pacote,
     * subclasses (extends).
     */

    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int taxaAceleracao;
    private double quilometrosPorLitro;

    // Construtores
    public Carro() {
        System.out.println("Construindo Carro...");
    }

    public Carro(String maraca, String modelo) {
        this.marca = maraca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    // Sobrecarga
    public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal,
            double tempoInicial) {
        return (velocidadeInicial - velocidadeFinal) / (tempoInicial - tempoFinal) * 3.6;
    }

    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
        return "" + (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    // Getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) throws NegocioException {
        if (velocidadeMaxima < 0) {
            throw new NegocioException("Velocidade inválida!");
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public int getTaxaAceleracao() {
        return taxaAceleracao;
    }

    public void setTaxaAceleracao(int taxaAceleracao) {
        this.taxaAceleracao = taxaAceleracao;
    }

    public double getQuilometrosPorLitro() {
        return quilometrosPorLitro;
    }

    public void setQuilometrosPorLitro(double quilometrosPorLitro) {
        this.quilometrosPorLitro = quilometrosPorLitro;
    }

}
