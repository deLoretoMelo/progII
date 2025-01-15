public class Livro {

    private String titulo;
    private String autor = "Autor desconhecido";
    private int anoPubli = -1;

    public Livro(String titulo){
        this.setTitulo(titulo);
    }

    public Livro(String titulo, String autor){
        this.setTitulo(titulo);
        this.setAutor(autor);
    }

    public Livro(String titulo, String autor, int anoPubli){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAno(anoPubli);
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAno(){
        return this.anoPubli;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAno(int ano){
        this.anoPubli = ano;
    }
}
