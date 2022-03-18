package br.com.caelum.contas.exemploFaculdade;

public class Professor extends EmpregadoDaFaculdade{
    private int horasDeAula;

    public Professor(String nome, double salario, int horasDeAula) {
        super(nome, salario);
        this.horasDeAula = horasDeAula;
    }

    @Override
    public double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }
    @Override
    public  String getInfo(){
        return super.getInfo() + ", Horas de aula:"+ this.horasDeAula;
    }

    public int getHorasDeAula() {
        return horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
}
