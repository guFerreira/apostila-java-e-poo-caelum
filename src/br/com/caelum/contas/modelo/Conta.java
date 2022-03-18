package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

import java.util.Date;

public abstract class Conta {
    private int id;
    private static int totalDeContas;
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Date dataAbertura;

    public Conta(String nomeTitular) {
        this.totalDeContas++;
        this.id = this.totalDeContas;
        this.nomeTitular = nomeTitular;
    }

    public Conta(String nomeTitular, int numero, String agencia) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
    }

    public abstract String getTipo();


    public void saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            throw new SaldoInsuficienteException("O saldo da conta é insuficiente");
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }


    }

    public double calcularRendimento(){
        return this.saldo * 0.1f;
    }

    public void transfere(Conta conta, double valor){
        this.saldo -= valor;
        conta.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "tipo='" + this.getTipo() + '\'' +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", data=" + dataAbertura +
                '}';
    }



    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public static void setTotalDeContas(int totalDeContas) {
        Conta.totalDeContas = totalDeContas;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
