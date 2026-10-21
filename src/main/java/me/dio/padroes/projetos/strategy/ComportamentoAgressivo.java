package me.dio.padroes.projetos.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo Agressivamente.....");
    }
}
