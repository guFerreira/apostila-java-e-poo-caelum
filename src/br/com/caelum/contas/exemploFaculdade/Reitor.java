package br.com.caelum.contas.exemploFaculdade;

public class Reitor extends EmpregadoDaFaculdade{

    public Reitor(String nome, double salario) {
        super(nome, salario);
    }

    public String getInfo() {
        return super.getInfo() + " Cargo: reitor";
    }

}
