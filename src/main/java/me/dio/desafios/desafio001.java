package me.dio.desafios;
/*
* Voce deve criar um programa que leia uma unica palavra e verifique se ela e exatamente igual a DEPOSITO, SAQUE ou TRANSFERENCIA.
* Se for igual a uma dessas opcoes, a operacao deve ser considerada valida. Caso contrario, ela deve ser considerada invalida.
* A comparacao deve respeitar exatamente os caracteres informados, incluindo letras maiusculas e minusculas. Assim,
* deposito e DEPOSITO devem ser tratados como valores diferentes.
* O problema foi pensado para praticar fundamentos de Java, como leitura de entrada, uso de strings,
* comparacao de texto e estruturas condicionais, mas a solucao pode ser implementada em qualquer linguagem usando apenas recursos padrao.*/

import java.util.Scanner;

public class desafio001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Qual sua operação?: ");
        System.out.println("DEPOSITO, SAQUE,TRANSFERENCIA");
        System.out.println("================================");
        String opcao = scanner.next().strip();

        if(opcao.equals("DEPOSITO") || opcao.equals("SAQUE") || opcao.equals("TRANSFERENCIA")){
            System.out.printf("%s e Valido!!!", opcao);
        }else{
            System.out.printf("%s e invalida!!", opcao);
        }
    }
}
