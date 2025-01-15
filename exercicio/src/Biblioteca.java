import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> Livros;

    public Biblioteca(){
        this.Livros = new ArrayList<Livro>();
    }

    public String addLivro(String titulo){
        Livro livro = new Livro(titulo);
        Livros.add(livro);
        return "Livro adicionado com sucesso !";
    }

    public String addLivro(String titulo, String autor){
        Livro livro = new Livro(titulo, autor);
        Livros.add(livro);
        return "Livro adicionado com sucesso !";
    }

    public String addLivro(String titulo, String autor, int ano){
        Livro livro = new Livro(titulo, autor, ano);
        Livros.add(livro);
        return "Livro adicionado com sucesso !";
    }

    public void listarLivros(){
        int cont = 1;
        System.out.println("--------BIBLIOTECA--------");
        for(Livro livro : Livros){
            System.out.println("Livro " + cont + ":");
            System.out.println("--Autor: " + livro.getAutor());
            System.out.println("--Titulo: " + livro.getTitulo());
            System.out.println("--Data: " + livro.getAno());
            System.out.println();
            cont++;
        }
        System.out.println("--------------------------");
    }
}
