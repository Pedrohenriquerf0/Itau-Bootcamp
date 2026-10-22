package me.dio.padroes.projetos.facade.sub.sistemas;

/*
 *  CRM
 * */
public class CRMService {
    private CRMService() {
    }

    public static void gravarClient(String nome, String cep, String estado, String cidade) {
        System.out.println("cliente salvo no sistema de CRM....");
    }
}
