package capitulo19;

import java.io.InputStream;
import java.util.Scanner;

public class Receiver implements Runnable {
    private InputStream server;
    public Receiver(InputStream servidor) {
        this.server = servidor;
    }

    public void run() {
        //recebe as mensagens do server e imprime
        Scanner s = new Scanner(this.server);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    }
}
