public class Pikachu extends Pokemon {
    public Pikachu(String nome, String tipo, int defesa, int ataq, int hp, int special, int speed, String status) {

        super(nome, tipo, defesa, ataq, hp, special, speed, status);
    }

    public void thunderShock() {
        System.out.println("Você atacou seu adversário com thenderShock!");
    }

    public void quickAttack() {
        System.out.println("Você atacou seu adversário com quick attack!");
    }

    public void tailWhip() {
        System.out.println("Você atacou seu adversário com tail whip!");
    }

    public void thunderWave() {
        System.out.println("Você atacou seu adversário com thunder wave!");
    }
}
