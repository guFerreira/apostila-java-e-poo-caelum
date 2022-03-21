package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(String nomeTitular) {
        super(nomeTitular);
    }

    public ContaCorrente(String nomeTitular, int numero, String agencia) {
        super(nomeTitular, numero, agencia);
    }

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public String getTipo(){
        return "Conta Corrente";
    }

    public void saca(double valor){
        if(valor > this.getSaldo() || valor < 0){
            throw new IllegalArgumentException("O valor informado para saque é inválido");
        }else {
            super.saca(valor - 0.10f);
        }
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
