import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Camelo", 150, 4, "Amarelo", "Terrestre", 2.0);
        Peixe p = new Peixe("Tubarão", 300, 0, "Cinzento", "Aquático", 1.5, "Não tem patas");
        Mamifero m = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", "Terrestre", 0.5, "Mel");

        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.add(animal);
        animais.add(p);
        animais.add(m);

        System.out.println("Zoo:");

        for (Animal a : animais) {
            System.out.println("------------------------------");
            System.out.println(a);
            System.out.println("------------------------------\n");
        }

        // Scanner s = new Scanner(System.in);

        // Normal n = new Normal(22);
        // CamaroteInferior ci = new CamaroteInferior(22, 5, "A1");
        // CamaroteSuperior cs = new CamaroteSuperior(22, 5, 5);

        // int res;
        // int res2 = 0;

        // System.out.println("Bem vindo ao cinema, Qual tipo de ingresso desejas?");
        // System.out.println("1- Normal\n2- Vip");

        // res = s.nextInt();
        // System.out.println();

        // if (res == 1) {
        // n.imprime();
        // System.out.println();

        // } else {
        // System.out.println("Você deseja um camarote inferior ou superior?");
        // System.out.println("1- Superior\n2- Inferior");

        // res2 = s.nextInt();
        // System.out.println();

        // if (res2 == 1) {

        // System.out.println("O ingresso vip escolhido foi o camarote superior\n");

        // } else {
        // System.out.println("O ingresso vip escolhido foi o camarote inferior\n");

        // }
        // }

        // System.out.println("Qual combo de pipoca você deseja?");
        // System.out.println("1- Pipoca pequena\n2- Pipoca média\n3- Pipoca grande");
        // int esc = s.nextInt();
        // double valorCombo = 0;
        // switch (esc) {
        // case 1:
        // valorCombo = 35.0;
        // break;
        // case 2:
        // valorCombo = 45.0;
        // break;
        // case 3:
        // valorCombo = 55.0;
        // break;

        // default:
        // break;
        // }

        // if (res == 1) {
        // System.out.println("O valor do ingresso normal é: " + n.getReais());
        // System.out.println("O valor do combo de pipoca é: " + valorCombo);
        // System.out.println("O valor total é: " + (n.getReais() + valorCombo));
        // } else if (res2 == 1) {
        // double valorAdd = cs.valorExtra();
        // System.out.println("O valor do ingresso vip camarote superior é: " +
        // valorAdd);
        // System.out.println("O valor do combo de pipoca é: " + valorCombo);
        // System.out.println("O valor total é: " + (cs.valorExtra() + valorCombo));
        // } else {
        // System.out.println("O valor do ingresso vip camarote inferior é: " +
        // ci.valorVip());
        // System.out.println("O valor do combo de pipoca é: " + valorCombo);
        // System.out.println("O valor total é: " + (ci.valorVip() + valorCombo));
        // }

        System.out.println("Bem vindo a estação de analise de Pikachus!\n");

        Pikachu pik = new Pikachu("Amiguinho", "Elétrico", 8, 11, 20, 12, 17, "Ok");

        System.out.println("Status do seu pikachu:");
        System.out.println(pik);

        System.out.println("Ótimo, agora realize testes de ataque:\n");
        boolean testes = true;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Qual ataque você deseja realizar?");
            System.out.println("1- ThunderShock;\n2- Quick Attack;\n3- Tail Whip;\n4- Thunder Wave.");
            int ataque = s.nextInt();

            switch (ataque) {
                case 1:
                    pik.thunderShock();
                    break;
                case 2:
                    pik.quickAttack();
                    break;
                case 3:
                    pik.tailWhip();
                    break;
                case 4:
                    pik.thunderWave();
                    break;
                default:
                    testes = false;
                    break;
            }

        } while (testes);

    }
}
