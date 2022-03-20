package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numero;
    private List<Conta> contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ArrayList<Conta>();
    }

    public void adiciona(Conta conta) {
        this.contas.add(conta);

    }

    public Conta pega(int i) {
        return this.contas.get(i);
    }

    public int pegaQuantidadeDeContas() {
        return this.contas.size();
    }

    public Conta buscaPorTitular(String nome) {
        for (Conta c: this.contas) {
            if (c.titular.equals(nome)){
                return c;
            }
        }
        return null;
    }

    public void mostrarContas() {
        for (Conta conta : this.contas) {
            if (conta != null)
                System.out.println("Conta " + conta.toString());
            else
                break;
        }
    }

    public boolean contem(Conta conta) {
        return this.contas.contains(conta);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

}
