package Capitulo20;

import java.util.Collection;

public class ProduzMensagem implements Runnable {
    private int comeco;
    private int fim;
    private Collection<String> mensagens;

    public ProduzMensagem(int comeco, int fim, Collection<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }

    @Override
    public void run() {
        for (int i = comeco; i < fim; i++) {
            synchronized (mensagens) { // sem o synchronized alguns valores não são inseridos corretamente
                mensagens.add("Mensagem criada número " + i);
            }
        }
    }

    public int getComeco() {
        return comeco;
    }

    public void setComeco(int comeco) {
        this.comeco = comeco;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public Collection<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(Collection<String> mensagens) {
        this.mensagens = mensagens;
    }
}
