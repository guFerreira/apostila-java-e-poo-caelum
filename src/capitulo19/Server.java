package capitulo19;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Servidor aberto na porta "+ port);

        Socket client = serverSocket.accept();
        System.out.println("Nova conexão com o cliente"	+ client.getInetAddress().getHostAddress());

        Scanner scanner = new Scanner(client.getInputStream());
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        serverSocket.close();

    }
}
