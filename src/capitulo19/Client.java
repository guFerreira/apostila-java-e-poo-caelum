package capitulo19;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private String host;
    private int porta;

    public Client(String host, int porta) {
        this.host = host;
        this.porta = porta;
    }

    public static void main(String[] args)
            throws UnknownHostException, IOException {
        //	se conecta a um servidor
        new Client("localhost", 8080).executa();
    }

    public void executa() throws UnknownHostException, IOException {
        Socket cliente = new Socket(this.host, this.porta);
        System.out.println("O	cliente	se	conectou	ao	servidor!");

        //thread que recebe as mensagens vindas do servidor
        Receiver r = new Receiver(cliente.getInputStream());
        new Thread(r).start();

        //lê o que foi escrito e envia para o servidor
        Scanner scanner = new Scanner(System.in);
        PrintStream output = new PrintStream(cliente.getOutputStream());
        while (scanner.hasNextLine()) {
            output.println(scanner.nextLine());
        }
        output.close();
        scanner.close();
        cliente.close();
    }

}
