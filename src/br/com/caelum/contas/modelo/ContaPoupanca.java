package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nomeTitular) {
        super(nomeTitular);
    }

    public ContaPoupanca(String nomeTitular, int numero, String agencia) {
        super(nomeTitular, numero, agencia);
    }

    @Override
    public String getTipo(){
        return "Conta Poupanca";
    }
}
