package capitulo14;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciComArray(6)));
    }

    public static int[] fibonacciComArray(int qnt){
        if (qnt <= 0){
            return null;
        }
        int [] valores = new int[qnt];
        if (qnt == 1){
            valores[0] = 1;
            return valores;
        }

        valores[0] = 1;
        valores[1] = 1;
        for (int i = 2; i < qnt; i ++){
            valores[i] = valores[i-2] + valores [i-1];
        }
        return valores;

    }
}
