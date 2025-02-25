public class Quadrado extends Retangulo{

    public Quadrado(float lado) {
        super(lado, lado);
    }

    @Override
    public float calcularArea() {
        return super.getLado() * super.getAltura();
    }

    @Override
    public float calcularPerimetro() {
        return (2*super.getLado()) + (2*super.getAltura());
    }
}
