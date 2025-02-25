public class Circulo extends Forma2D{

    private float raio;
    private final double pi = Math.PI;

    public Circulo(float raio){
        this.setRaio(raio);
    }
    public float getRaio() {
        return this.raio;
    }

    public double getPI() {
        return this.pi;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        Double resposta = this.pi * Math.pow((this.raio),2);
        return resposta.floatValue();
    }

    @Override
    public float calcularPerimetro() {
        Double resposta = 2*this.pi*this.raio;
        return resposta.floatValue();
    }

}
