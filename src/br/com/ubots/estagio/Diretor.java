package br.com.ubots.estagio;

public class Diretor extends Gerente implements Autenticavel{
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

}
