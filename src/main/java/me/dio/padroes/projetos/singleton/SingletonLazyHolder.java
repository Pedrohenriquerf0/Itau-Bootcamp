package me.dio.padroes.projetos.singleton;


/*

@author Pedrohenriquerf0
*/
public class SingletonLazyHolder {
    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }
}
