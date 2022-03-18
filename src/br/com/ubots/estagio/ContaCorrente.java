package br.com.ubots.estagio;

import br.com.caelum.contas.modelo.Conta;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(String nomeTitular) {
        super(nomeTitular);
    }

    public ContaCorrente(String nomeTitular, int numero, String agencia) {
        super(nomeTitular, numero, agencia);
    }

    @Override
    public String getTipo(){
        return "Conta Corrente";
    }

    public void saca(double valor){
        super.saca(valor - 0.10f);
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
