public class Animal {
    private String nome;
    private double comprimento;
    private int numDePatas;
    private String cor;
    private String ambiente;
    private double velol;

    public Animal(String nome, double comp, int patas, String cor, String ambiente, double velol){
        this.nome = nome;
        this.comprimento = comp;
        this.numDePatas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velol = velol;
    }

    public String getNome() {
        return nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public int getNumDePatas() {
        return numDePatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public double getVelol() {
        return velol;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumDePatas(int numDePatas) {
        this.numDePatas = numDePatas;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelol(double velol) {
        this.velol = velol;
    }

    @Override
    public String toString(){
        return "Animal: " + this.nome + "\nComprimento: " + this.comprimento + "cm\nPatas: " + this.numDePatas +
            "\nCor: " + this.cor + "\nAmbiente: " + this.ambiente + "\nVelocidade: " + this.velol + " m/s";
    }
}
