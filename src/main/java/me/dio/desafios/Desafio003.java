package itau.bootcamp.desafios;


import java.util.Scanner;

/*
 * No banco ByteBank, uma nova etapa do treinamento de desenvolvedores simula o processamento de operacoes em contas digitais.
 * A equipe quer avaliar se os candidatos entendem como modelar comportamentos simples de objetos e como tratar situacoes invalidas,
 * como se fossem excecoes de negocio.
 *
 * Para isso, cada teste descreve uma conta com saldo inicial e uma tentativa de operacao.
 * Implemente um programa que leia uma unica operacao bancaria e informe o resultado final.
 * Existem dois tipos de operacao: DEPOSITO e SAQUE. Se a operacao for DEPOSITO, o valor deve ser somado ao saldo. Se for SAQUE,
 * o valor deve ser subtraido apenas se houver saldo suficiente. Considere como erro qualquer valor menor ou igual a zero.
 * Tambem e erro informar um tipo de operacao diferente dos dois permitidos. Nesses casos, em vez de atualizar a conta,
 *  o programa deve retornar uma mensagem de falha. O objetivo e representar a ideia de uma classe Conta com metodos de deposito e saque,
 *  alem de validacoes equivalentes ao lancamento de excecoes, embora a solucao final deva apenas imprimir a resposta pedida.
 *
 * Entrada
 * A entrada contem tres linhas. A primeira linha possui uma string com o tipo da operacao:
 * DEPOSITO ou SAQUE. A segunda linha contem uma string representando um numero inteiro com o saldo inicial da conta.
 * A terceira linha contem uma string representando um numero inteiro com o valor da operacao.
 *
 * Saída
 * Se a operacao for valida, imprima Saldo final: X, em que X e o saldo apos o processamento.
 * Se o tipo for invalido, imprima Erro: operacao invalida. Se o valor for menor ou igual a zero, imprima Erro: valor invalido.
 * Se um saque exceder o saldo, imprima Erro: saldo insuficiente.*/

public class Desafio003 {

    static class Conta {
        private int saldo;

        public Conta(int saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void depositar(int valor) {
            validarValor(valor);
            saldo += valor;
        }

        public void sacar(int valor) {
            validarValor(valor);

            if (valor > saldo) {
                throw new IllegalArgumentException("Erro: saldo insuficiente");
            }

            saldo -= valor;
        }

        public int getSaldo() {
            return saldo;
        }

        private void validarValor(int valor) {
            if (valor <= 0) {
                throw new IllegalArgumentException("Erro: valor invalido");
            }
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            // 1. Lemos a linha inteira e limpamos possíveis tags <br> ou espaços extras
            String linhaCompleta = scanner.nextLine().trim();

            // Se a plataforma enviar tudo em uma linha separado por <br>, substituímos por espaço
            linhaCompleta = linhaCompleta.replaceAll("(?i)<br>", " ");

            // Usamos um novo Scanner para ler os dados limpos de dentro dessa string
            Scanner leitorDados = new Scanner(linhaCompleta);

            // Caso os dados não estivessem na mesma linha, leitorDados estará vazio,
            // então precisamos garantir que pegamos as próximas linhas se necessário:
            String operacao = leitorDados.hasNext() ? leitorDados.next() : linhaCompleta;

            int saldoInicial = 0;
            int valorOperacao = 0;

            if (leitorDados.hasNextInt()) {
                saldoInicial = leitorDados.nextInt();
            } else if (scanner.hasNextInt()) {
                saldoInicial = scanner.nextInt();
            }

            if (leitorDados.hasNextInt()) {
                valorOperacao = leitorDados.nextInt();
            } else if (scanner.hasNextInt()) {
                valorOperacao = scanner.nextInt();
            }

            Conta conta = new Conta(saldoInicial);

            try {
                if (operacao.equalsIgnoreCase("DEPOSITO")) {
                    conta.depositar(valorOperacao);
                    System.out.println("Saldo final: " + conta.getSaldo());
                } else if (operacao.equalsIgnoreCase("SAQUE")) {
                    conta.sacar(valorOperacao);
                    System.out.println("Saldo final: " + conta.getSaldo());
                } else {
                    System.out.println("Erro: operacao invalida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            leitorDados.close();
        }

        scanner.close();
    }

}
