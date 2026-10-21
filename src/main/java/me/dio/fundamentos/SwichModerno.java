package me.dio.fundamentos;

public class SwichModerno {
    public static void main(String[] args) {
        String tipoItem = "NOTEBOOK";

// O switch devolve o resultado direto para a variável 'diasPrazo'
        int diasPrazo = switch (tipoItem) {
            case "MOUSE", "TECLADO" -> 30; // Sintaxe direta (sem bloco)

            case "NOTEBOOK" -> {
                // Bloco com várias linhas de lógica
                System.out.println("Item de alto valor. Aplicando regra especial...");
                int prazoPadrao = 15;
                int bonusTI = 5;

                yield prazoPadrao + bonusTI; // Devolve 20 para a variável 'diasPrazo'
            }

            default -> {
                System.out.println("Item comum.");
                yield 7; // Valor padrão devolvido
            }
        };

        System.out.println("Prazo: " + diasPrazo); // Imprime: Prazo: 20
    }
}
