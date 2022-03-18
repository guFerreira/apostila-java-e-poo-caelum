package br.com.caelum.contas;

import br.com.caelum.javafx.api.util.Evento;
import br.com.ubots.estagio.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida seguroDeVida;


    public void criaSeguro(Evento evento){
        this.seguroDeVida = new SeguroDeVida( evento.getDouble("valor"),
                evento.getString("titular"), evento.getInt("numeroApolice") );
    }
}
