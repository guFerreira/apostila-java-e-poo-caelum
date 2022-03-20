package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario implements Autenticavel{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.14f + 1000;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

}
