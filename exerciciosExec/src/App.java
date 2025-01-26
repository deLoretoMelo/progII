// import java.util.InputMismatchException;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner scan = new Scanner(System.in);
        // String pos[] = {"primeira", "segunda", "terceira"};
        // int valores[] = new int[3];
        // boolean verdade = true;
        // do{
        //     System.out.println("Preencha 3 valores no array na posição desejada.");
        //     try{
        //         for (int i = 0; i < pos.length; i++) {
        //             System.out.print("Diga a " + pos[i] + " posição: ");
        //             int idx = scan.nextInt();
        //             System.out.print("Diga o valor da posição " + idx + ": ");
        //             int val = scan.nextInt();
        //             valores[idx] = val;
                    
        //             verdade = false;
        //         }
        //     }
        //     catch(ArrayIndexOutOfBoundsException e){
        //         System.err.println("Erro! " + e);
        //         System.out.println("As posições devem ser 0, 1 e 2");
        //         System.out.println();
        //     }
        //     catch(InputMismatchException e){
        //         System.err.println("Erro! " + e);
        //         scan.nextLine();
        //         System.out.println("O único tipo que pode ser digitado é Int!");
        //         System.out.println();
        //     }
        // }while(verdade);

        // System.out.print("Os 3 valores são: ");
        //     for (int v : valores)
        //         System.out.print(v + " ");
        

        // scan.close();

        Conta c = new Conta(1000);
        c.deposito(1200);

        try{
            c.saque(300);
            c.saque(300);
            c.saque(400);
            c.saque(10);
        }catch(ContaException e){
            System.err.println(e);
            System.out.println("Saldo da conta: " + e.getSaldo());
        }
    }
}
