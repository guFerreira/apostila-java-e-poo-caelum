package capitulo5;

public class FabricaDeCarro {
    public static FabricaDeCarro instancia = new FabricaDeCarro();
    private  String nome;
    private FabricaDeCarro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
