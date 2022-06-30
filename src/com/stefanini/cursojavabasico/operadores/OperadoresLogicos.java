package com.stefanini.cursojavabasico.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /**
         * 
         * AND
         * V and F => F
         * V and V => V
         * F and V => F
         * F and F => F
         *
         * OR
         * V or F => V
         * V or V=> V
         * F or V => V
         * F or F => F
         * 
         * V xor F => V
         * V xor V=> F
         * F xor V => V
         * F xor F => F]
         * 
         * Negação lógica
         * !V => F
         * !F => V    
         */

         boolean v = true;
         boolean f = false;

         // and &&
         // or ||
         // xor !=

         
         System.out.println(v != f);
    }
}
