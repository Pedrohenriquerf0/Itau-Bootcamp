package me.dio.padroes.projetos.singleton;

/*
@author Pedrohenriquerf0
*/
public class SingletonLazy {
    private static SingletonLazy instancia; // preguiçoso

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
