package capitulo11.exercicioOpcional;

import java.util.Date;

public class ContaCorrente implements ContaTributavel {
    private int id;
    private static int totalDeContas;
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Date dataAbertura;


    @Override
    public String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposita(double valor) {
        if(valor > 0){
            this.saldo += valor;
        }
    }

    public void saca(double valor){
        this.saldo = valor - 0.10f;
    }

    @Override
    public void atualiza(double taxaSelic) {
        System.out.println("taxa selic da conta corrente"+ taxaSelic);
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
