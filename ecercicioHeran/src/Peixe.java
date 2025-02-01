public class Peixe extends Animal{
    private String caracteristca;

    public Peixe(String nome, double comp, int patas, String cor, String ambiente, double velol, String carac){
        super(nome, comp, patas, cor, ambiente, velol);
        this.setCaracteristca(carac);
    }

    public String getCaracteristca() {
        return caracteristca;
    }

    public void setCaracteristca(String caracteristca) {
        this.caracteristca = caracteristca;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCaracteristica: " + this.caracteristca;
    }
}   
