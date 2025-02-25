package pck_4;

public class Correntista {
    private String cpfCliente;
    private float saldo;

    public Correntista(){}

    public Correntista(String cpfCliente, float saldo){
        this.setCpfCliente(cpfCliente);
        this.setSaldo(saldo);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
