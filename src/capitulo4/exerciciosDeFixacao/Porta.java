package capitulo4.exerciciosDeFixacao;

public class Porta {
    private boolean aberta;
    private Cor cor;
    private float dimensaoX;
    private float dimensaoY;
    private float dimensaoZ;

    public Porta() {

    }
    public Porta(boolean aberta, Cor cor, float dimensaoX, float dimensaoY, float dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void abrir(){
        this.aberta = true;
    }
    public void fechar(){
        this.aberta = false;
    }

    public void pintar(Cor novaCor){
        this.cor = novaCor;
    }

    public boolean isAberta(){
        return this.aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public float getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public float getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public float getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(float dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
}
