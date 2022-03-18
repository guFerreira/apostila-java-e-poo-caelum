package br.com.caelum.contas.exemploFaculdade;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("João", 8000, 200);
        Reitor reitor = new Reitor("Maria", 10000);
        EmpregadoDaFaculdade empregadoDaFaculdade = new EmpregadoDaFaculdade("Gustavo",3000);


        GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();
        geradorDeRelatorio.add(professor);
        geradorDeRelatorio.add(reitor);
        geradorDeRelatorio.add(empregadoDaFaculdade);
    }
}
