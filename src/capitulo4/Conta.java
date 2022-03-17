package capitulo4;

import java.util.Date;

public class Conta {
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Date dataAbertura;

    public Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void sacarDinheiro(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double calcularRendimento(){
        return this.saldo * 0.1f;
    }

    @Override
    public String toString() {
        return "Conta{" +
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
