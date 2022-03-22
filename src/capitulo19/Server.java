package capitulo19;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    //servidor vai receber a mensagem de algum cliente e
    // vai distribuir para todos os outros que também estão conectados
    private int porta;
    private List<PrintStream> clientes;

    public Server(int porta) {
        this.porta = porta;
        this.clientes = new ArrayList<PrintStream>();
    }

    public static void main(String[] args) throws IOException {
        // inicia o server
        new Server(8080).run();
    }

    public void run() throws IOException {
        ServerSocket server = new ServerSocket(this.porta);

        System.out.println("Porta "+this.porta+" aberta!");
        while (true) {
            // aceita um cliente
            Socket cliente = server.accept();
            System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());

            // adiciona informação do cliente vinda através do getOutputStream para adicionar em uma lista
            PrintStream ps = new PrintStream(cliente.getOutputStream());
            this.clientes.add(ps);

            // classe para tratar thread de cada cliente
            TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);

            new Thread(tc).start();
        }
    }

    public void distribuiMensagem(String msg) {
        // envia a mensagem para os outros clientes
        for (PrintStream cliente : this.clientes) {
            cliente.println(msg);
        }
    }
}
