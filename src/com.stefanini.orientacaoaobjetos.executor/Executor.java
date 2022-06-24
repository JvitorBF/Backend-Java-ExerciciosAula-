package com.stefanini.orientacaoaobjetos.executor;

import com.stefanini.orientacaoaobjetos.Bmw;
import com.stefanini.orientacaoaobjetos.Carro;
import com.stefanini.orientacaoaobjetos.Mercedes;

public class Executor {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("MERCEDES");
        carro1.setModelo("C130");
        carro1.setChassi(123456789);
        carro1.setPlaca("G7HP890");
        carro1.setRoda(4);
        carro1.setBancos(2);
        carro1.setVelocidade(100);

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getChassi());
        System.out.println(carro1.getPlaca());
        System.out.println(carro1.getRoda());
        System.out.println(carro1.getBancos());

        System.out.println(carro1.acelerar());

        Carro carro2 = new Carro("MERCEDES");
        System.out.println(carro2.getMarca());

       /*  System.out.println(soma(10, 20, 30));
        System.out.println(soma(10, 20)); */

        Bmw bm = new Bmw();
        bm.setVelocidade(100);
        System.out.println(bm.acelerar());

        Mercedes mercedes = new Mercedes();
        System.out.print(mercedes.acelerar());
    }

    /*
     * public static int soma (int a, int b) {
     * return a + b;
     * }
     * 
     * public static int soma (int a, int b, int c) {
     * return a + b + c;
     * }
     */

}
