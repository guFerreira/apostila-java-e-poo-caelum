package capitulo17;

import java.io.*;

public class TestaEntrada {
    public static void main(String[] args) throws IOException {

        //InputStream	is	=	new	FileInputStream("arquivo.txt"); faz a leitura de um arquivo

        /* faz a leitura do teclado
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }*/


        /* escreve e cria um texto em um arquivo
        OutputStream	os	=	new	FileOutputStream("saida.txt");
        OutputStreamWriter	osw	=	new	OutputStreamWriter(os);
        BufferedWriter	bw	=	new	BufferedWriter(osw);
        bw.write("caelum");
        bw.close();*/

    }
}
