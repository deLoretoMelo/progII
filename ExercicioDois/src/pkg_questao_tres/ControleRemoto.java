package pkg_questao_tres;

public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tev) {
        this.tv = tev;
    }

    public void AumentarSom() {
        if (this.tv.getVolume() < this.tv.getVolMax()) {
            this.tv.VolumeUp();
        } else {
            System.out.println("O volume já está no máximo!");
        }
    }

    public void DiminuirSom() {
        if (this.tv.getVolume() > this.tv.getVolMin()) {
            this.tv.VolumeDown();
        } else {
            System.out.println("O volume já está no mínimo!");
        }
    }

    public void AumentarCanal() {
        if (this.tv.getCanal() < this.tv.getCanalMax()) {
            this.tv.CanalUp();
        } else {
            System.out.println("O canal já está no máximo!");
        }
    }

    public void DiminuirCanal() {
        if (this.tv.getCanal() > this.tv.getCanalMin()) {
            this.tv.CanalDown();
        } else {
            System.out.println("O canal já está no mínimo!");
        }
    }

    public void trocarCanal(int canal) {
        this.tv.setCanal(canal);
    }

    public void ShowVolECanal() {
        System.out.println("Volume: " + this.tv.getVolume());
        System.out.println("Canal: " + this.tv.getCanal());
    }

}
