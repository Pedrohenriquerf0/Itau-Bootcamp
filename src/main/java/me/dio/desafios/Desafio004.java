package itau.bootcamp.desafios;

import java.util.Scanner;

public class Desafio004 {

    static class Conta {
        private int saldo;

        public Conta(int saldoInicial) {
            this.saldo = saldoInicial;
        }

        public String processarOperacao(String tipoOperacao, int valor) {
            if (!tipoOperacao.equals("DEPOSITAR") && !tipoOperacao.equals("SACAR")) {
                return "ERRO: OPERACAO INVALIDA";
            }

            // TODO: valide se o valor da operacao eh menor ou igual a zero.
            // Nesse caso, retorne a mensagem de erro correspondente.
            if (tipoOperacao.equalsIgnoreCase("SACAR") && valor < saldo) {
                saldo -= valor;
                return "OK " + saldo;
            }

            if (tipoOperacao.equals("DEPOSITAR")) {
                saldo += valor;
                return "OK " + saldo;
            }

            if (valor > saldo) {
                return "ERRO: SALDO INSUFICIENTE";
            }

            saldo -= valor;
            return "OK " + saldo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            // 1. Lemos a linha inteira e limpamos possíveis tags <br> ou espaços extras
            String linhaCompleta = scanner.nextLine().trim();

            // Usamos um novo Scanner para ler os dados limpos de dentro dessa string
            Scanner leitorDados = new Scanner(linhaCompleta);

            // Caso os dados não estivessem na mesma linha, leitorDados estará vazio,
            // então precisamos garantir que pegamos as próximas linhas se necessário:
            String tipoOperacao = leitorDados.hasNext() ? leitorDados.next() : linhaCompleta;
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
            String resultado = conta.processarOperacao(tipoOperacao, valorOperacao);

            System.out.println(resultado);
            scanner.close();
        }
    }
}
