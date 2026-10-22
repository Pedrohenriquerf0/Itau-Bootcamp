package me.dio.padroes.projetos.facade;


import me.dio.padroes.projetos.facade.sub.sistemas.CRMService;
import me.dio.padroes.projetos.facade.sub.sistemas.CepAPI;

public class Facade {
    public void migraClient(String name, String cep){
        String cidade = CepAPI.getInstance().recuperaCidade(cep);
        String estado = CepAPI.getInstance().recuperaEstado(cep);
        CRMService.gravarClient(name, cep, cidade, estado);
        System.out.println(name + cep + cidade + estado);
    }
}
