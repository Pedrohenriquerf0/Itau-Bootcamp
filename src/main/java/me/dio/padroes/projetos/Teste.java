package me.dio.padroes.projetos;

import me.dio.padroes.projetos.facade.Facade;
import me.dio.padroes.projetos.singleton.SingletonEager;
import me.dio.padroes.projetos.singleton.SingletonLazy;
import me.dio.padroes.projetos.singleton.SingletonLazyHolder;
import me.dio.padroes.projetos.strategy.*;


public class Teste {
    public static void main(String[] args) {
        // SINGLETON
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonEager eager = SingletonEager.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        System.out.println(lazy);
        System.out.println(eager);
        System.out.println(lazyHolder);

        System.out.println("=================");
        // STRATEGY
        Robo myRobo = new Robo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento denfesivo = new ComportamentoDenfesivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        myRobo.setComportamento(normal);
        myRobo.mover();
        myRobo.setComportamento(denfesivo);
        myRobo.mover();
        myRobo.setComportamento(agressivo);
        myRobo.mover();


        // FACADE
        Facade facade = new Facade();
        facade.migraClient("Pedro", "12345-98");
    }


}
