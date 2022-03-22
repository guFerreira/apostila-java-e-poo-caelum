package br.com.caelum.contas;

import br.com.caelum.javafx.api.util.Evento;
import br.com.caelum.contas.modelo.Tributavel;

public class ManipuladorDeTributaveis {
    private double total;

    public void calculaImpostos(Evento evento){
        total = 0;
        int tamanhoListaTributaveis = evento.getTamanhoDaLista("listaTributaveis");

        for(int i =0; i < tamanhoListaTributaveis; i++){
            Tributavel t = evento.getTributavel("listaTributaveis", i);
            total = total + t.getValorImposto();

        }
    }

    public double getTotal() {
        return total;
    }
}
