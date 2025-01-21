import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // ATIVIDADE DE LISTA
        System.out.println("Escreva um inteiro para ser invertido:");
        int num = input.nextInt();
        inverteArray(num);
        System.out.println();

        //produto de uma serie de inteiros
        int[] serie = {5,4,10,7,6};
        produtoSerie(serie);
        System.out.println();


        //uniao de listas
        int[] lista1 = {11,13,45,7};
        int[] lista2 = {24,11,16,81,10,12};

        uniaoDeArray(lista1, lista2);

    }

    public static void inverteArray(int a){
        String numero = Integer.toString(a);
        // String aux[] = numero.split("");
        // String aux2 = "";
        String b = "";
        // for (int i = aux.length - 1; i >= 0; i--){
        //     aux2 += aux[i];
        // }
        for(int i = numero.length() - 1; i >=0 ; i--){
            b += Character.toString(numero.charAt(i));
        }
        int novoInt = Integer.valueOf(b).intValue();
        System.out.println("Intiero invertido: " + novoInt);

    }

    public static void produtoSerie(int[] lista){
        double prod = 1;
        for(int num: lista){
            prod *= num;
        }
        System.out.println("Produto dos inteiros da lista passada: " + prod);
    }

    public static void uniaoDeArray(int[] lista1, int[] lista2){
        int[] uniao = new int[lista1.length + lista2.length];
        for(int i = 0; i <= lista1.length - 1; i++){
            uniao[i] = lista1[i];
        }
        int cont = lista1.length;
        for(int i = 0; i <= lista2.length - 1; i++){
            uniao[cont] = lista2[i];
            cont++;
        }
        int[] uniaoFinal = new int[uniao.length];
        int tam = 0;

        for(int i = 0; i<=uniaoFinal.length - 1; i++){
            boolean e = false;
            for(int j = 0; j < tam; j++){
                if(uniao[i] == uniaoFinal[j]){
                    e = true;
                    break;
                }
            }
            if(!e){
                uniaoFinal[tam++] = uniao[i];
            }
        }

        int[] resp = new int[tam];
        for(int i = 0; i < tam; i++){
            resp[i] = uniaoFinal[i];
        }

        for(int num: resp
        ){
            System.out.println(num);
        }
    }
}
