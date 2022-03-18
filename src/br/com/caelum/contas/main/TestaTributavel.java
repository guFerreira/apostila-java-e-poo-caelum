package br.com.caelum.contas.main;

import br.com.ubots.estagio.ContaCorrente;
import br.com.ubots.estagio.Tributavel;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Gustavo",1231,"agencia teste");
        cc.depositar(100);
        System.out.println(cc.getValorImposto());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.getValorImposto());
    }
}
