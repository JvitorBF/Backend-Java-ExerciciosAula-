package com.stefanini.orientacaoaobjetos;

import com.stefanini.orientacaoaobjetos.Carro;

public class Bmw extends Carro {

    public Bmw() {
        this.setMarca("BMW");
    }

    @Override
    public String acelerar() {
        return "A BMW pode fazer de 0 " + this.getVelocidade() + " em 5s";
    }

}
