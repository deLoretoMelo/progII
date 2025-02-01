public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comp, int patas, String cor, String ambiente, double velol, String alimento){
        super(nome, comp, patas, cor, ambiente, velol);
        this.setAlimento(alimento);
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAlimento: " + this.alimento;
    }
}
