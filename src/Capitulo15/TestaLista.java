package Capitulo15;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestaLista {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Random r = new Random();
        for(int i =0; i < 20; i++){
            Conta novaConta = new ContaCorrente("Teste"+i);
            novaConta.depositar(r.nextInt(200));
            contas.add(novaConta);
        }
        System.out.println(contas.toString());
    }
}
