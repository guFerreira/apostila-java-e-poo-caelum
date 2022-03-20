package capitulo14;

public class TestaSplit {
    public static void main(String[] args) {
        System.out.println(inverterFrase("Uma mensagem qualquer"));
    }

    public static String inverterFrase(String frase){
        String[] palavras = frase.split(" ");
        String fraseInvertida = "";
        for(int i = palavras.length-1; i >= 0; i--){
            fraseInvertida = fraseInvertida + palavras[i] + " ";
        }
        return fraseInvertida;
    }
}
