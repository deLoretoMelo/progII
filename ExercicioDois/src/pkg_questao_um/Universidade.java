package pkg_questao_um;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departs;

    public Universidade(String nome) {
        this.setDeparts();
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Departamento> getDeparts() {
        return this.departs;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDeparts() {
        this.departs = new ArrayList<Departamento>();
    }

    public void showDepsAndUni(ArrayList<Departamento> departs) {
        System.out.println("------------UNIVERSIDADE---------------");
        System.out.println("Nome da Universidade: " + this.getNome());
        System.out.println("Departamentos da Universidade:");
        int i = 1;
        for (Departamento depart : departs) {
            System.out.println(i + " - " + depart.getNome());
            i++;
        }
    }
}
