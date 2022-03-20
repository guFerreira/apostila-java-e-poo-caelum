package Capitulo15;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaSet {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente("titular1");
        c1.setAgencia("123");
        c1.setNumero(101010);

        Conta c2 = new ContaCorrente("titular1");
        c2.setAgencia("123");
        c2.setNumero(101010);

        System.out.println(c1.equals(c2));

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
        Iterator<String> i	=	conjunto2.iterator();
        while	(i.hasNext())	{
            //	recebe	a	palavra
            String	palavra	=	i.next();
            System.out.println(palavra);
        }

    }
}
