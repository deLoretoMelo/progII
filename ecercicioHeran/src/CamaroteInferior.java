public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(double valor,double vA, String localizacao){
        super(valor, vA);
        setLocalizacao(localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocal(){
        System.out.println("A localizacao do camarote inferio é: " + this.getLocalizacao());
    }
}
