package capitulo11.exercicioOpcional;


import java.util.Date;

public class ContaPoupanca implements Conta {
    private int id;
    private static int totalDeContas;
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Date dataAbertura;

    @Override
    public String getTipo(){
        return "Conta Poupanca";
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

    @Override
    public void saca(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    @Override
    public void atualiza(double taxaSelic) {
        System.out.println("taxa selic da conta poupança"+ taxaSelic);
    }
}
