package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Gerente;

public class TesteBonificacoes {
    public static void main(String[] args) {
        ControleDeBonificacoes c = new ControleDeBonificacoes();
        c.registra(new Gerente("Gustavo","1233123",4000));
        c.registra(new Gerente("Ana","4124124",4500));

        //o código abaixo não compila mais pq a classe agora é abstrata!
        //Funcionario f = new Funcionario("Funcionario teste","41255523",2000);
        //c.registra(f);
        System.out.println(c.getTotalDeBonificacoes());
    }
}
