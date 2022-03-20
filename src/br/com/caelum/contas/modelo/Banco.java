package br.com.caelum.contas.modelo;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ContaCorrente[10];
    }

    public void adiciona(Conta conta) {
        int contador = 1;
        for (int i = 0; i < this.contas.length; i++) {
            if (this.contas[i] == null){
                this.contas[i] = conta;
                break;
            }
            contador++;
        }
        if (contador == this.contas.length){
            System.out.println("Lista está cheia");
            Conta[] novoArray = new Conta[this.contas.length *2];
            for (int i =0; i < contador; i++){
                novoArray[i]= this.contas[i];
            }
            this.contas = novoArray;
            this.adiciona(conta);
        }
    }

    public void mostrarContas(){
        for (Conta conta:this.contas){
            if (conta != null)
                System.out.println("Conta "+ conta.toString());
            else
                break;
        }
    }

    public boolean contem(Conta conta){
        for (int i =0; i < contas.length;i++){
            if (this.contas.equals(conta)){
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Conta[] getContas() {
        return contas;
    }
}
