public class Retangulo extends Forma2D{

    private float lado;
    private float altura;

    public Retangulo(float lado, float altura){
        this.setLado(lado);
        this.setAltura(altura);
    }

    public float getAltura() {
        return altura;
    }

    public float getLado() {
        return lado;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return this.lado * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return (2*this.altura) + (2*this.lado);
    }
    
}
