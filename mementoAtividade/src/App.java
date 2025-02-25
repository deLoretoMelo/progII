import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        EditorDeTexto et = new EditorDeTexto("");
        Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo ao editor de texto\n");
        while(true){
            System.out.println("O que você deseja fazer?\n");
            System.out.println("1) Escrever\n2) Ler\n3) Ctrl+z\n4) Sair\n");
            int res = s.nextInt();
            switch (res) {
                case 1:
                    et.escrever();
                    break;
                case 2:
                    et.ler();
                    break;
                case 3:
                    et.ctrlZ();
                    break;
                default:
                    break;
            }
            if(res == 4){
                s.close();
                break;
            }
        }
    }
}
