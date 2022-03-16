package capitulo3;

public class ExercicioX {
    public static void main(String[] args) {
        //Imprima todos os números de 150 a 300.
        for (int i = 150; i <= 300; i++){
            System.out.println(i);
        }

        //Imprima a soma de 1 até 1000.
        for (int i = 150; i <= 300; i++){
            System.out.println(i);
        }

        //Imprima todos os múltiplos de 3, entre 1 e 100.
        for (int i = 0; i < 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }

        //Imprima os fatoriais de 1 a 10.
        System.out.println("Imprima os fatoriais de 1 a 10.");
        int fatorial = 0;
        for (int i = 0; i <= 10; i++){
            if(i == 0){
                fatorial = 1;
            }else{
                fatorial = fatorial * i;
            }
            System.out.println(fatorial);
        }
        System.out.println("Fibonacci");
        int n1 = 0, n2 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Fim");


        //(Opcional) Escreva um programa em que, dada uma variável x
        // com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
        int x = 13;
        while ( x != 1){
            if(x%2 == 0){
                //é par
                x = x/2;
            }else{
                x = 3*x + 1;
            }
            System.out.print(x + " ");
        }

        System.out.println("");
        System.out.println("(Opcional) Imprima a seguinte tabela usando fors encadeados: \n");
        /** (Opcional) Imprima a seguinte tabela usando fors encadeados:
         * 1
         * 2 4
         * 3 6 9
         * 4 8 12 16
         * n n*2 n*3 .... n*n
         */
        int tamanho = 4;
        for (int i = 1; i <= tamanho; i++){
            if (i == 1){
                System.out.println(i+" ");
            }else{
                for (int j = 1; j <= i; j++){
                    System.out.print(i*j + " ");
                }
                System.out.println("");
            }

        }

    }
}
