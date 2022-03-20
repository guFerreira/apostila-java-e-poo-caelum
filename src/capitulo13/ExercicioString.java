package capitulo13;

public class ExercicioString {
    public static void main(String[] args) {

        //Exercício 13.7.3 - modificação para imprimir fj22
        String	s	=	"fj11";
        s = s.replaceAll("1",	"2");
        System.out.println(s);

        //Exercício 13.7.4
        if(s.contains("fj")){
            System.out.println("A string contem fj");
        }

        String espacoEmBranco = " string com espaco";
        String [] strings = espacoEmBranco.split(" ");
        System.out.println("A string ta vazia?"+ s.isEmpty());
        System.out.println("TAmanho da string "+ s.length());

        //Exercício 13.7.5
        imprimePorCaracter("String por caracter");
        //Exercício 13.7.6
        imprimePorCaracterInvertido("anotaram a data da maratona");
        //Exercício 13.7.7
        imprimePorCaracterInvertidoComStringBuilder("anotaram a data da maratona");
        //Desafio
        int intConvertido = converterStringParaNumero("510");
        System.out.println(intConvertido);
    }

    public static void imprimePorCaracter(String palavra){
        for(int i =0;i < palavra.length(); i ++){
            System.out.println(palavra.charAt(i));
        }
        System.out.println();
    }

    public static void imprimePorCaracterInvertido(String palavra){
        for(int i = palavra.length()-1; i >= 0; i--){
            System.out.print(palavra.charAt(i));
        }
        System.out.println();
    }

    public static void imprimePorCaracterInvertidoComStringBuilder(String palavra){
        StringBuilder sb = new StringBuilder();

        for(int i = palavra.length()-1;i >= 0; i--){
            sb.append(palavra.charAt(i));
        }
        System.out.print(sb.toString()+"\n");

    }

    public static int converterStringParaNumero(String stringNumero){
        int numero = 0;
        for(int i =0; i < stringNumero.length(); i++){
            numero = numero + (stringNumero.charAt(i) - '0');
        }
        return numero;
    }
}
