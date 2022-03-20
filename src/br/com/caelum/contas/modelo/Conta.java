package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public abstract class Conta  implements Comparable<Conta>{
    private int id;
    private static int totalDeContas;
    protected String titular;
    protected int numero;
    protected String agencia;
    protected double saldo;
    private Date dataAbertura;

    public Conta(String nomeTitular) {
        this.totalDeContas++;
        this.id = this.totalDeContas;
        this.titular = nomeTitular;
    }

    public Conta(String nomeTitular, int numero, String agencia) {
        this.titular = nomeTitular;
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
        }else{
            throw new IllegalArgumentException("O valor informado é menor que 0");
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
    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }
    @Override
    public String toString() {
        String s = "Conta{\n" +
                "tipo='" + this.getTipo() + '\'' +
                "nomeTitular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                "\n}\n";
        return s.toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero == conta.numero && agencia.equals(conta.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
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
