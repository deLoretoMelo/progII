package pck_4;

import java.util.Scanner;

public class Movimento implements MovimentoConta {

    private String cpfCorrentista;
    private float valorMovimento;

    public Movimento(String cpf, float valor){
        this.cpfCorrentista = cpf;
        this.valorMovimento = valor;
    }

    @Override
    public String getCpfCorrentista() {
        return this.cpfCorrentista;
    }

    @Override
    public float getValorMovimento() {
        System.out.println("O valor que será movimentado é crédito ou débito?(c/d)");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.next();
        switch (res) {
            case "c":
                return this.valorMovimento;
            case "d":
                return -this.valorMovimento;
            default:
                return 0;
        }
        
    }

}
