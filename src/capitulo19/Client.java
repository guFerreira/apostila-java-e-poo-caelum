package capitulo19;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        Socket client = new Socket("localhost",port);
        System.out.println("Cliente conectado ao servidor");

        Scanner input = new Scanner(System.in);
        PrintStream output = new PrintStream(client.getOutputStream());
        while (input.hasNextLine()){
            output.println(input.nextLine());

        }
        output.close();
        input.close();
    }
}
