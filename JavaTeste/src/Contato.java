public class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.setEmail(email);
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.email;
    }

}
