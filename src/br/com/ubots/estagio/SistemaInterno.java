package br.com.ubots.estagio;

public class SistemaInterno {
    public void login(Autenticavel autenticavel){
        int senha = 123;// obtem a senha de algum lugar
        boolean ok = autenticavel.autentica(senha);
    }
}
