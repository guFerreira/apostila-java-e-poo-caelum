package capitulo14;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        for (int i =0; i < contas.length;i++){
            Conta c = new ContaCorrente("Conta teste");
            c.depositar(i*1000);
            contas[i] = c;
        }


        System.out.println(calcularMediaSalarial(contas));

    }

    public static double calcularMediaSalarial(Conta[] contas){
        double media = 0;
        for(Conta conta: contas){
            media = media + conta.getSaldo();
        }
        return media/contas.length;
    }
}
