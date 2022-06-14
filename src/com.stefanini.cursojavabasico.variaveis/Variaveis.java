package com.stefanini.cursojavabasico.variaveis;

public class Variaveis {
    public static void main(String[] args) {
        byte numByte = -128; // -128 a 127 (8 bits)
        short numShort = 12321; // -32 768 e 32 767 (16 bits)
        int numInt = 2147483647; // -2.147.483.648 a 2.147.483.647 (32bits)
        long numLong = 2147483647; // -9 223 372 036 854 770 000, o valor máximo é 9 223 372 036 854 770 000 (64 bits)

        float numFloat = 10.000f; // -14924E -37 a 3.40282347E + 38 (32 bits)
        double numDouble = 100000000000000.000; // -4,94E-307 a 1.79769313486231570E+308 (64 bits)

        char varChar = 'F'; // 0 a 65535 (16 bits)

        boolean varBool = true; // True or False (1 bit)

        String texto = "Bem-vindos Devs!";
        Integer numeroConta = 4000;
        long numeroLongo = 1213123L;

        // Ela deve começar com uma letra minúscula. Exemplo: nome
        // Não deve começar com caracteres especiais como & (e comercial). $(dólar).
        // _(sublinhado). Exemplo: _nome
        // Se o nome for composto por mais de uma palavra. Inicia-se a primeira palavra
        // com a letra minuscula seguida por uma letra maiúscula. Exemplo: nomeCompleto
        // Evite usar variáveis de um caractere. Exemplo: a
    }
}
