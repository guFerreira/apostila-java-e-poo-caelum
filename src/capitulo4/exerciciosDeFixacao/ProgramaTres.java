package capitulo4.exerciciosDeFixacao;

public class ProgramaTres {
    public static void main(String[] args) {
        Porta p1 = new Porta(false,new Cor("Marrom"),1,2,0.05f);
        Porta p2 = new Porta(false,new Cor("Marrom"),1,2,0.05f);
        Porta p3 = new Porta(false,new Cor("Marrom"),1,2,0.05f);

        Casa casa = new Casa(new Cor("Amarelo"),p1,p2,p3);
        casa.getPorta1().abrir();
        casa.getPorta2().fechar();
        casa.getPorta3().abrir();
        System.out.println(casa.quantasPortasEstaoAbertas());

    }
}
