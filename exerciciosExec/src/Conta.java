public class Conta {
    private double saldo;
    private double limiteDiario;

    public Conta(double limiteDiario){
        this.setSaldoZero();
        this.setLimite(limiteDiario);
    }

    public void setSaldoZero(){
        this.saldo = 0;
    }

    public void setLimite(double limiteDiario){
        this.limiteDiario = limiteDiario;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return this.limiteDiario;
    }

    public void deposito(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!\nValor depositado: " + valor + "\nSaldo atual da conta: " + getSaldo());
        System.out.println();
    }

    public void saque(double valor) throws ContaException{
        if(valor > this.limiteDiario || valor > this.saldo){
            throw new ContaException("Erro ao realizar saque! O valor passado é maior que o limite diario da conta, ou maior que o saldo da conta!", this.saldo);
        }
        else{
            this.saldo -= valor;
            this.limiteDiario -= valor;
            System.out.println("O saque foi realizado com sucesso!\nSaldo atual: " + getSaldo());
            System.out.println("Limite diario restante: " + limiteDiario);
            System.out.println();
        }
    }
}
