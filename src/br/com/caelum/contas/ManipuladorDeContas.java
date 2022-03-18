package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;
import br.com.ubots.estagio.ContaCorrente;
import br.com.ubots.estagio.ContaPoupanca;

public class ManipuladorDeContas {

    private Conta conta;
    public void criaConta(Evento evento){
        String tipo = evento.getSelecionadoNoRadio("tipo");
        if (tipo.equals("Conta Corrente")){
            this.conta = new ContaCorrente(evento.getString("titular"),
                    evento.getInt("numero"), evento.getString("agencia"));
        }else if(tipo.equals("Conta Poupanca")){
            this.conta = new ContaPoupanca(evento.getString("titular"),
                    evento.getInt("numero"), evento.getString("agencia"));
        }
    }

    public void saca(Evento evento){
        double valor = evento.getDouble("valorOperacao");
        this.conta.saca(evento.getDouble("valor"));
    }

    public void deposita(Evento evento){
        this.conta.depositar(evento.getDouble("valorOperacao"));
    }

    public void transfere(Evento evento){
        this.conta.transfere((Conta) evento.getSelecionadoNoCombo("destino"),
                evento.getDouble("valor"));
    }
}
