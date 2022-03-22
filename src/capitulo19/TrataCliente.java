package capitulo19;

import java.io.InputStream;
import java.util.Scanner;

public class TrataCliente implements Runnable{
    private InputStream cliente;
    private Server servidor;

    public TrataCliente(InputStream cliente, Server servidor) {
        this.cliente = cliente;
        this.servidor = servidor;
    }

    public void run() {
        //	distribui a mensagem para os outros clientes
        Scanner s = new Scanner(this.cliente);
        while (s.hasNextLine()) {
            servidor.distribuiMensagem(s.nextLine());
        }
        s.close();
    }
}

