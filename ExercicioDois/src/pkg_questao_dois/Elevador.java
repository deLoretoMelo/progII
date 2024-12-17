package pkg_questao_dois;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int pessoasNoElevador = 0;

    public Elevador(int totalAndares, int capacidade) {
        this.setTotalAndares(totalAndares);
        this.setCapacidade(capacidade);
    }

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public int getTotalAndares() {
        return this.totalAndares;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public int getPessoasNoElevador() {
        return this.pessoasNoElevador;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }

    public String Entra() {

        if (this.pessoasNoElevador < this.capacidade) {
            this.pessoasNoElevador++;
            return "Um passageiro entrou no elevador!";
        } else {
            return "Não é possível entrar no elevado! Capacidade lotada!";
        }
    }

    public String Sai() {
        if (pessoasNoElevador > 0) {
            this.pessoasNoElevador--;
            return "Um passageiro saiu do elevador!";
        } else {
            return "Não é possível que saia um passageiro, pois o elevador está vazio!";
        }
    }

    public String sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
            return "O elevador subiu para o andar " + this.andarAtual;
        }
        return "O elevador está no último andar (andar: " + this.totalAndares + ")";
    }

    public String desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
            return "O elevador desceu para o andar " + this.andarAtual;
        }
        return "O elevador está no térreo, e nao pode descer mais!";
    }

    @Override
    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", capacidade=" + capacidade + ", pessoasNoElevador="
                + pessoasNoElevador + ", totalAndares=" + totalAndares + "]";
    }
}
