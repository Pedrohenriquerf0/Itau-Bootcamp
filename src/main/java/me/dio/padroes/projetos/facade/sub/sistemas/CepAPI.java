package me.dio.padroes.projetos.facade.sub.sistemas;

/*
 *  CEP
 * */
public class CepAPI {
    private static CepAPI instacia = new CepAPI();

    private CepAPI() {

    }

    public static CepAPI getInstance(){
        return instacia;
    }


    public String recuperaCidade(String cep){
        return "Manaus";
    }

    public String recuperaEstado(String cep){
        return "Amazônias";
    }
}

