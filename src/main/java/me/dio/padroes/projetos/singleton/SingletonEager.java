package me.dio.padroes.projetos.singleton;

/*
@author Pedrohenriquerf0
*/
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager(); // apressado

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
