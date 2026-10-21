package me.dio.padroes.projetos.strategy;

public class ComportamentoDenfesivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo Defensivamente.....");
    }
}
