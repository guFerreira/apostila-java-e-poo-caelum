package capitulo4;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNomeTitular("Danilo");
        c1.setSaldo(100);

        Conta c2 = c1;
        c2.setNomeTitular("Danilo");
        c2.setSaldo(100);

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

    }
}
