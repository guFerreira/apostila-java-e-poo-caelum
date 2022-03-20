package Capitulo15;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.*;

public class TestaLista {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            Conta novaConta = new ContaCorrente("Teste" + i);
            novaConta.depositar(r.nextInt(200));
            contas.add(novaConta);
        }
        System.out.println(contas.toString());

        Set<String> conjunto = new HashSet<>();
        conjunto.add("java");
        conjunto.add("vraptor");
        conjunto.add("scala");
        for (String palavra : conjunto) {
            System.out.println(palavra);
        }

        Set<String>	conjunto2	=	new	HashSet<>();
        conjunto2.add("item	1");
        conjunto2.add("item	2");
        conjunto2.add("item	3");
        //	retorna	o	iterator
        Iterator<String>	i	=	conjunto2.iterator();
        while	(i.hasNext())	{
            //	recebe	a	palavra
            String	palavra	=	i.next();
            System.out.println(palavra);
        }

    }
}
