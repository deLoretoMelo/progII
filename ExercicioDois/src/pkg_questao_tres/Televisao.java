package pkg_questao_tres;

public class Televisao {
    private int volume, canal, volMax, volMin, canalMax, canalMin;

    public Televisao(int canal) {
        this.canalMax = 17;
        this.canalMin = 1;
        this.volume = 0;
        this.setCanal(canal);
        this.volMax = 100;
        this.volMin = 0;

    }

    public int getVolume() {
        return this.volume;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getVolMax() {
        return this.volMax;
    }

    public int getVolMin() {
        return this.volMin;
    }

    public int getCanalMax() {
        return this.canalMax;
    }

    public int getCanalMin() {
        return this.canalMin;
    }

    public void setCanal(int canal) {
        if ((canal > this.canalMax) || (canal < this.canalMin)) {
            System.out.println("Este canal não existe!");
        } else {
            this.canal = canal;
        }

    }

    public void VolumeUp() {
        this.volume++;
    }

    public void VolumeDown() {
        this.volume--;
    }

    public void CanalUp() {
        this.canal++;
    }

    public void CanalDown() {
        this.canal--;
    }

}
