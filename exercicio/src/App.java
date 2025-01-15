import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // System.out.println("Coloque o valor que corresponde um dia da semana (1 -
        // 7):");
        // int entrada = input.nextInt();

        // Questão 1

        // switch (entrada) {
        // case 1:
        // System.out.println("Domingo");
        // break;
        // case 2:
        // System.out.println("Segunda");
        // break;
        // case 3:
        // System.out.println("Terça");
        // break;
        // case 4:
        // System.out.println("Quarta");
        // break;
        // case 5:
        // System.out.println("Quinta");
        // break;
        // case 6:
        // System.out.println("Sexta");
        // break;
        // case 7:
        // System.out.println("Sábado");
        // break;
        // default:
        // System.out.println("Infelizmente esse dia da semana nao existe :(");
        // break;
        // }

        // System.out.println("");
        // System.out.println("------------------------------------------------------------");
        // System.out.println("");

        // Questão 2

        // System.out.println("Escreva o nome de um mês: ");
        // String mes = input.next();

        // switch (mes) {
        // case "janeiro":
        // case "fevereiro":
        // case "março":
        // case "abril":
        // case "maio":
        // case "junho":
        // System.out.println("Primeiro semestre");
        // break;
        // case "julho":
        // case "agosto":
        // case "setembro":
        // case "outubro":
        // case "novembro":
        // case "dezembro":
        // System.out.println("Segundo semestre");
        // break;
        // default:
        // break;
        // }

        // Questão 3

        // System.out.println("Digite a:");
        // int a = input.nextInt();
        // System.out.println("Digite op:");
        // String op = input.next();
        // System.out.println("Digite b:");
        // int b = input.nextInt();

        // double resultado = 0;

        // switch (op){
        // case "+":
        // resultado = a + b;
        // break;
        // case "-":
        // resultado = a - b;
        // break;
        // case "*":
        // resultado = a * b;
        // break;
        // case "/":
        // resultado = a / b;
        // break;
        // default:
        // System.out.println("A operação informada nao existe!");
        // break;
        // }

        // System.out.println("Resultado da operação: " + resultado);

        // Questão 4

        // int ultimoTermo = input.nextInt();

        // double fat = 1;

        // for(int i = 1; i <= ultimoTermo; i++){
        // double x = 1;
        // for (int j = i; j > 0; j--){
        // x *= j;
        // }
        // fat += 1/x;
        // }

        // System.out.println(fat);

        // Questão 5

        Biblioteca b = new Biblioteca();

        b.addLivro("vida de inseto", "vasco", 2025);
        b.addLivro("Flamengogogogo");
        b.addLivro("mibr", "aspas");

        b.listarLivros();

        // ATIVIDADE DE LISTA
        // inverteArray(10);
    }

    // public static void inverteArray(int a){
    // String numero = Integer.toString(a);
    // // String aux[] = numero.split("");
    // // String aux2 = "";
    // String b = "";
    // // for (int i = aux.length - 1; i >= 0; i--){
    // // aux2 += aux[i];
    // // }
    // for(int i = numero.length() - 1; i >=0 ; i--){
    // b += Character.toString(numero.charAt(i));
    // }
    // int novoInt = Integer.valueOf(b).intValue();
    // System.err.println(novoInt);

    // }
}
