public class CamaroteSuperior extends Vip {
    private double valorAdicionalExtra;

    public CamaroteSuperior(double valor, double vA, double vAE) {
        super(valor, vA);
        this.setValorAdicionalExtra(vAE);
    }

    public void setValorAdicionalExtra(double valorAdicionalExtra) {
        this.valorAdicionalExtra = valorAdicionalExtra;
    }

    public double getValorAdicionalExtra() {
        return valorAdicionalExtra;
    }

    public double valorExtra() {
        double valor = super.valorVip();
        return valor + this.valorAdicionalExtra;
    }
}
