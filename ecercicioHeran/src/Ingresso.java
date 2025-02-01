public class Ingresso {
    private double reais;

    public Ingresso(double valor){
        this.setReais(valor);
    }

    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        this.reais = reais;
    }

    public void imprimeValor(){
        System.out.println("Valor do ingresso: " + this.getReais());
    }
}
