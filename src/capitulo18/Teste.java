package capitulo18;

public class Teste {
    public static void main(String[] args) {
        Programa p1 = new Programa();
        p1.setId(1);
        Thread t1 = new Thread(p1);
        t1.start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Programa com classe anonima" + "	valor: " + i);
                }
            }
        };
        Thread t2 = new Thread(runnable);
        t2.start();
        //O resultado pode mudar a cada vez que o código é executado por conta da thread
    }
}
