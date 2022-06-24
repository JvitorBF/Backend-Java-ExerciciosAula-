package com.stefanini.orientacaoaobjetos;

import com.stefanini.orientacaoaobjetos.Carro;

public class Mercedes extends Carro {

    public Mercedes () {
        this.setMarca("MERCEDES");
    }

    @Override
    public String acelerar() {
        return "A Mercedes tem um aceleração diferente para cada modelo";
    }


}