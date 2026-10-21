package me.dio.fundamentos;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5;  // Em binário: 0000 0101
        int b = 3;  // Em binário: 0000 0011

        // 1. Bitwise AND (&)
        // 0101 & 0011 = 0001 (1)
        System.out.println("a & b = " + (a & b));

        // 2. Bitwise OR (|)
        // 0101 | 0011 = 0111 (7)
        System.out.println("a | b = " + (a | b));

        // 3. Bitwise XOR (^)
        // 0101 ^ 0011 = 0110 (6)
        System.out.println("a ^ b = " + (a ^ b));

        // 4. Bitwise NOT (~)
        // ~0000 0101 = 1111 1010 (-6 em complemento de dois)
        System.out.println("~a = " + (~a));

        // 5. Shift para a esquerda (<<)
        // 0000 0101 << 1 = 0000 1010 (10)
        System.out.println("a << 1 = " + (a << 1));

        // 6. Shift para a direita com sinal (>>)
        // 0000 0101 >> 1 = 0000 0010 (2)
        System.out.println("a >> 1 = " + (a >> 1));

        // 7. Shift para a direita sem sinal (>>>)
        int c = -5;
        System.out.println("c >>> 1 = " + (c >>> 1));

    }
}
