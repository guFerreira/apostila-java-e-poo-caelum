package Capitulo15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {
    public static void main(String[] args) {

        testarColecao(new ArrayList<>(),"Iniciando Arraylist",30000);
        System.out.println("---------------------------------------------");
        testarColecao(new HashSet(),"Iniciando Hashset",30000);
        System.out.println("---------------------------------------------");
        testarColecao(new LinkedList(),"Iniciando LinkedList",30000);

        System.out.println("=====================================================");
        testarColecao(new ArrayList<>(),"Iniciando Arraylist",50000);
        System.out.println("---------------------------------------------");
        testarColecao(new HashSet(),"Iniciando Hashset",50000);
        System.out.println("---------------------------------------------");
        testarColecao(new LinkedList(),"Iniciando LinkedList",50000);
    }

    public static void testarColecao(Collection c, String mensagemInicio, int tamanho){
        System.out.println(mensagemInicio);
        inserir(c,tamanho);
        contem(c,tamanho);
    }
    public static void inserir(Collection collection, int total){
        System.out.println("Iniciando inserção");
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            collection.add(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto para inserir:	" + tempo);
    }
    public static void contem(Collection collection, int total){
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            collection.contains(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto no metodo contains:	" + tempo);
    }
}
