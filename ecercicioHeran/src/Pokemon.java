public class Pokemon {
    private String nome;
    private String tipo;
    private int defesa;
    private int ataque;
    private int hp;
    private int special;
    private int speed;
    private String status;

    public Pokemon(String nome, String tipo, int defesa, int ataq, int hp, int special, int speed, String status) {
        this.setAtaque(ataq);
        this.setDefesa(defesa);
        this.setHp(hp);
        this.setNome(nome);
        this.setSpecial(special);
        this.setTipo(tipo);
        this.setSpeed(speed);
        this.setStatus(status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpecial() {
        return special;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getHp() {
        return hp;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "--Nome: " + this.getNome() +
                "\n--Tipo: " + this.getTipo() +
                "\n--Ataque: " + this.getAtaque() +
                "\n--Defesa: " + this.getDefesa() +
                "\n--Vida: " + this.getHp() +
                "\n--Velocidade: " + this.getSpeed() +
                "\n--Especial: " + this.getSpecial() +
                "\n--Status: " + this.getStatus();
    }
}
