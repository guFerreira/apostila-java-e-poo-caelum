package capitulo4;

public class Fibonacci {

    public static long calcularFibonacci(long i){
        return i >=1 && i <=2 ?
                1 :
                Fibonacci.calcularFibonacci(i - 1) + Fibonacci.calcularFibonacci(i - 2);
        /*if(i >=1 && i <=2){
            return 1;
        }
        return calcularFibonacci(i -1) + calcularFibonacci( i -2 );*/
    }

    public static void exibirSequencia(int n){
        for (int i = 1 ; i < n; i++){
            System.out.print(Fibonacci.calcularFibonacci(i)+" ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Fibonacci.exibirSequencia(5);
        Fibonacci.exibirSequencia(10);
    }

}
