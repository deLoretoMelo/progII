public class App {
    public static void main(String[] args) {
        // int numOne = 16;
        // int numTwo = 15;

        // System.out.println("Maior numero é: " + Maior(numOne, numTwo));

        // System.out.println();

        // int num = 10;
        // zeroAteNumero(num);

        // System.out.println();

        // somaEMulti();

        // int a = 2, b = 4;
        // a = trocaDePrimitivas(b, b = a);
        // System.out.println(a + " " + b);

        // System.out.println();

        // troca2();

        Agenda agenda = new Agenda();
        Contato contato1 = new Contato("João", "joao@gmail.com");
        Contato contato2 = new Contato("maria", "maria@gmail.com");
        Contato contato3 = new Contato("jose", "jose@gmail.com");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        for (Contato contato : agenda.getAgenda()) {
            System.out.println(contato.getNome() + " " + contato.getEmail());
        }

        String removida = agenda.removerContato("maria");
        System.out.println(removida);

        if (agenda.buscarContato("marcelo") != null) {
            System.out.println("Contato encontrado");
        } else {
            System.out.println("Contato não encontrado");
        }

        for (Contato contato : agenda.getAgenda()) {
            System.out.println(contato.getNome() + " " + contato.getEmail());
        }

        Contato c = agenda.buscarContato("jose");
        System.out.println(c);

    }

    public static int Maior(int numOne, int numTwo) {
        if (numOne > numTwo) {
            return numOne;
        } else {
            return numTwo;
        }
    }

    public static void zeroAteNumero(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void somaEMulti() {
        int somaImpares = 0;
        double multiPares = 1;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            } else {
                multiPares *= i;
            }
        }
        System.out.println("Soma dos impares: " + somaImpares);
        System.out.println("Multiplicação dos pares: " + multiPares);
    }

    public static int trocaDePrimitivas(int b, int a) {
        return b;

    }

    public static void troca2() {
        int a = 2, b = 99;
        a = b - a;
        b = b - a;
        a = a + b;
        System.out.println(a + " " + b);
    }
}
