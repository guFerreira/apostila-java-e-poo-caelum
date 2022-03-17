package capitulo4.exerciciosDeFixacao;

public class Casa {
    private Cor cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(Cor cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public void pintar(Cor novaCor){
        this.cor = novaCor;
    }

    public int quantasPortasEstaoAbertas(){
        int qnt = 0;
        if(porta1.isAberta()){
            qnt++;
        }
        if(porta2.isAberta()){
            qnt++;
        }
        if(porta2.isAberta()){
            qnt++;
        }
        return qnt;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
}
