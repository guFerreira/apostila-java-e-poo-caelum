package Capitulo20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TesteThreadConcorrente {
    public static void main(String[] args) throws InterruptedException {
        Collection<String> mensagens = new HashSet<>();
        // se tentar utilizar um Vector, na própria implementação dele já há o synchronized nos seus metodos
        //Collection<String> mensagens = new Vector<>();
        Thread thread1 = new Thread(new ProduzMensagem(0, 10000, mensagens));
        Thread thread2 = new Thread(new ProduzMensagem(10000, 20000, mensagens));
        Thread thread3 = new Thread(new ProduzMensagem(20000, 30000, mensagens));

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Acabou as threads");
        verificarMensagensGuardadas(mensagens);
    }

    public static void verificarMensagensGuardadas(Collection mensagens) {
        if (mensagens.contains(null)){
            throw new IllegalStateException("foi encontrado valor null na lista");
        }
        for (int i = 0; i < 15000; i++) {
            if (!mensagens.contains("Mensagem criada número " + i)) {
                throw new IllegalStateException("A mensagens número "+ i + " não foi encontrada");
            }
        }


    }
}
