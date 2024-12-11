import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
    }

    public ArrayList<Contato> getAgenda() {
        return this.contatos;
    }

    public String adicionarContato(Contato contato) {
        this.contatos.add(contato);
        return "Contato adicionado com sucesso!";
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public String removerContato(String nome) {
        Contato removido = buscarContato(nome);
        if (removido != null) {
            contatos.remove(removido);
            return "Contato: " + removido.getNome() + " removido com sucesso!";
        }
        return "Contato não encontrado e não excluído!";
    }

}
