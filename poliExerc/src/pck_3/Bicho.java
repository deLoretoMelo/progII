package pck_3;

public class Bicho implements Animal {
    private String especie;
    private String nome;

    public Bicho(String especie, String nome) {
        this.setEspecie(especie);
        this.setNome(nome);
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEspecie() {
        return this.especie;
    }

    @Override
    public String getNomeAnimal() {
        return this.nome;
    }

}
