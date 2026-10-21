package me.dio.fundamentos;

public class PrePosIncrement {
    public static void main(String[] args) {
        // PRE INCREMENTO
        int b = 5;
        int resultado = ++b;

        // O que aconteceu:
        // 1. b passa de 5 para 6
        // 2. resultado recebe o valor novo (6)

        System.out.println(b);         // Imprime 6
        System.out.println(resultado); // Imprime 6


        System.out.println("====================");
        // POS INCREMENTO
        int x = 5;
        int result = b++;

        // O que aconteceu:
        // 1. resultado recebe o valor antigo de b (5)
        // 2. b passa de 5 para 6

        System.out.println(x);         // Imprime 6
        System.out.println(result); // Imprime 5
    }
}
