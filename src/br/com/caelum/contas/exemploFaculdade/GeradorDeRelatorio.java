package br.com.caelum.contas.exemploFaculdade;

public class GeradorDeRelatorio {
    public void add(EmpregadoDaFaculdade empregado){
        System.out.println("------------------------------");
        System.out.println("RELATÓRIO");
        System.out.println(empregado.getInfo());
        System.out.println("Gastos: "+empregado.getGastos());
    }
}
