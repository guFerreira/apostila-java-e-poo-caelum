package br.com.caelum.contas.modelo;

public class Diretor extends Gerente implements Autenticavel{
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

}
