package pck_3;

public class Resultado {
    private String nomeEspecie;
    private int quantidade;

    public Resultado(String nome, int quantidade) {
        this.setNomeEspecie(nome);
        this.setQuantidade(quantidade);
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
