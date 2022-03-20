package capitulo14;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("TesteBank", 999);
        for (int i = 0; i < 15; i++) {
            ContaCorrente conta = new ContaCorrente("Teste"+i,i,"123");
            conta.depositar(i * 1000 +10);
            banco.adiciona(conta);
        }

        banco.mostrarContas();

    }
}
