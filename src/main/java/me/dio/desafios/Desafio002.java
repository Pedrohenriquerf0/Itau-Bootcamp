package me.dio.desafios;
/*
* Voce deve criar um programa que leia dois textos: o codigo informado pelo operador e o codigo esperado pelo sistema.
* Se os dois textos forem exatamente iguais, o programa deve indicar que a validacao foi aprovada.
* Caso contrario, deve informar que houve erro de digitacao. A comparacao deve considerar todos os caracteres exatamente como foram recebidos,
* incluindo letras maiusculas, minusculas, numeros e simbolos. Nao ha necessidade de tratar espacos extras fora do que for lido como entrada.
* O problema possui um unico objetivo: decidir se os dois codigos sao identicos ou nao.*/

import java.util.Scanner;

public class Desafio002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();

        if(codigoInformado.equals(codigoEsperado)){
            System.out.println("ACESSO LIBERADO");
        }else {
            System.out.println("ACESSO NEGADO");
        }
        scanner.close();
    }
}
