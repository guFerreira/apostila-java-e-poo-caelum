package br.com.ubots.estagio;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.14f + 1000;
    }

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
