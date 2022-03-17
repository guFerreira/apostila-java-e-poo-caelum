package capitulo4.exerciciosDeFixacao;

public class ProgramaDois {
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.setDimensaoX(1);
        porta.setDimensaoY(2);
        porta.setDimensaoZ(0.05f);
        porta.abrir();
        System.out.println(porta.isAberta());
        porta.fechar();
        System.out.println(porta.isAberta());

        porta.setCor(new Cor("Azul"));
        System.out.println(porta.getCor().getNome());


    }
}
