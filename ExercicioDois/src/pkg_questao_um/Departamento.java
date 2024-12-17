package pkg_questao_um;

// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Departamento {

    private String nome;

    private ArrayList<Pessoa> pessoas;

    public Departamento(String nome) {
        this.setNome(nome);
        this.setPessoas();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void showPeopleAndDep(ArrayList<Pessoa> pessoas) {
        System.out.println("Nome do Departamento: " + this.getNome());
        System.out.println("Servidores do departamento:");
        int j = 1;
        for (Pessoa pessoa : pessoas) {
            System.out.println(j + " - Nome: " + pessoa.getNome() + "; Email: " + pessoa.getEmail() + "; Telefone: "
                    + pessoa.getTelefone());
            j++;
        }
    }
}
