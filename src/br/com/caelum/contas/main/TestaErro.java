package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

class TestaErro {
    public static void main(String[] args) {

        //exercício 12.2
        testarMetodo1();

        // exercício 12.8
        testarTryCatch();

    }
    static void testarMetodo1(){
        System.out.println("inicio	do	main");
        try {
            metodo1();
        }catch (NullPointerException e){
            System.out.println("Erro:" + e);
        }
        System.out.println("fim	do	main");
    }

    static void metodo1() {
        System.out.println("inicio	do	metodo1");
        //try {
        metodo2();
        //} catch (NullPointerException e) {
        //    System.out.println("erro: " + e);
        //}

        System.out.println("fim	do	metodo1");
    }

    static void metodo2() {
        System.out.println("inicio	do	metodo2");
        ContaCorrente cc = new ContaCorrente("x");
        //try {
        for (int i = 0; i <= 15; i++) {

            cc.depositar(i + 1000);
            System.out.println(cc.getSaldo());
            if (i == 5) {
                cc = null;
            }
        }
        //} catch (NullPointerException e) {
        //    System.out.println("erro:	" + e);

        /*
        Em vez de fazer o try em torno do for inteiro, tente apenas com o bloco de dentro do for:
        Qual a diferença? ele vai continuar repetindo a ação no try até o for acabar, e isso vai gerar vários
        nullpointer do 5 até o 15
        for (int i = 0; i <= 15; i++) {
            try {
                cc.depositar(i + 1000);
                System.out.println(cc.getSaldo());
                if (i == 5) {
                    cc = null;
                }
            } catch (NullPointerException e) {
                System.out.println("erro:	" + e);
            }
        }*/
        System.out.println("fim	do	metodo2");
    }


    public static void testarTryCatch(){
        try {
            Conta cc = new ContaCorrente("Gustavo");
            cc.depositar(10);

            Conta cp = new ContaPoupanca("Gustavo teste");
            cp.depositar(10);


            cc.saca(50);
            System.out.println("consegui sacar da corrente!");
            cp.saca(50);
            System.out.println("consegui sacar da poupança!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}


