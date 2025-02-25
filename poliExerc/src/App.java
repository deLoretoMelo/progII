import java.util.Random;

import pck_3.Animal;
import pck_3.Bicho;
import pck_3.Ferramenta;
import pck_3.Resultado;
import pck_4.Correntista;
import pck_4.Movimento;
import pck_4.Operacao;

public class App {
    public static Resultado[] resultados(Animal[] animais, Ferramenta f) {
        String[] especies = f.classificaEspecies(animais);
        Resultado[] resultados = new Resultado[especies.length];

        int j = 0;
        for (String especie : especies) {
            int soma = 0;
            for (Animal animal : animais) {
                if (animal.getEspecie().equals(especie)) {
                    soma++;
                }
            }
            resultados[j] = new Resultado(especie, soma);
            j++;
        }

        return resultados;

    }

    public static void atualizarSaldos(Correntista[] c, Movimento[] m, Operacao o){
        
        for (int i = 0; i<m.length; i++){

            Correntista encontrado = o.encontraCorrentista(c, m[i].getCpfCorrentista());
            if(encontrado != null){
                encontrado.setSaldo(encontrado.getSaldo() + m[i].getValorMovimento());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // Questao 3:
        System.out.println("-----------------------QUESTAO 3-----------------------\n");
        Bicho b1 = new Bicho("Mamifero", "Rex");
        Bicho b2 = new Bicho("Anfibio", "Miau");
        Bicho b3 = new Bicho("Mamifero", "Totó");
        Bicho b4 = new Bicho("Reptil", "Felix");
        Bicho b5 = new Bicho("Peixe", "Rex");
        Bicho b6 = new Bicho("Peixe", "Marta");
        Bicho b7 = new Bicho("Ave", "Alex");
        Bicho b8 = new Bicho("Peixe", "Ale");

        Animal[] animais = { b1, b2, b3, b4, b5, b6, b7, b8 };

        Ferramenta f = new Ferramenta();

        // f.mostrarAnimais(animais);

        // Animal[] animaisFiltrados = f.filtraEspecie(animais, "Cachorro");
        // for (Animal a : animaisFiltrados) {
        // System.out.println("Especie do animal filtrado: " + a.getEspecie());
        // System.out.println("Nome do animal filtrado: " + a.getNomeAnimal() + "\n");
        // }

        // String[] animaisClassificados = f.classificaEspecies(animais);
        // for (String a : animaisClassificados) {
        // System.out.println("Especie classificada: " + a + "\n");
        // }

        Resultado[] res = resultados(animais, f);
        for (Resultado r : res) {
            System.out.println("Especie: " + r.getNomeEspecie());
            System.out.println("Quantidade: " + r.getQuantidade() + "\n");
        }
        System.out.println("-----------------------QUESTAO 3-----------------------\n");

        // Questao 4:
        System.out.println("-----------------------QUESTAO 4-----------------------\n");


        Correntista c1 = new Correntista("000.000.000-80", 1500);
        Correntista c2 = new Correntista("010.010.010-10", 3500);
        Correntista c3 = new Correntista("200.020.200-20", 1500);
        Correntista c4 = new Correntista("030.003.030-30", 1000);
        Correntista c5 = new Correntista("500.500.050-80", 700);
        Correntista c6 = new Correntista("004.040.404-84", 500);

        Correntista[] correntistas = new Correntista[]{c1,c2,c3,c4,c5,c6};

        Movimento mc1 = new Movimento("000.000.000-80", 1700);
        Movimento mc2 = new Movimento("004.040.404-84", 800);
        Movimento mc3 = new Movimento("111.040.404-84", 500);
        Movimento mc4 = new Movimento("030.003.030-30", 1500);
        Movimento mc5 = new Movimento("004.222.404-84", 500);
        Movimento mc6 = new Movimento("010.010.010-10", 1000);

        Movimento [] movimentos = new Movimento[]{mc1,mc2,mc3,mc4,mc5,mc6};

        Operacao o = new Operacao();

        System.out.println("Clientes e seus saldos iniciais:\n");
        for(Correntista cor : correntistas){
            System.out.println("Cpf: " + cor.getCpfCliente() + ", Saldo: " + cor.getSaldo() + "\n");
        }

        atualizarSaldos(correntistas, movimentos, o);

        System.out.println("Novos saldos dos clientes:\n");
        for(Correntista cor : correntistas){
            System.out.println("Cpf: " + cor.getCpfCliente() + ", Saldo: " + cor.getSaldo() + "\n");
        }

        System.out.println("-----------------------QUESTAO 4-----------------------\n");

        // Questao 6:
        System.out.println("-----------------------QUESTAO 6-----------------------\n");
        Forma2D[] formas = new Forma2D[5];

        Random r = new Random();

        for (int i = 0; i < formas.length; i++) {
            int escolha = r.nextInt(0, 3);
            if (escolha == 0) {
                float raio = r.nextFloat(0, 100);
                formas[i] = new Circulo(raio);
                System.out.println("Circulo adicionado com raio: " + raio + "\n");
            } else if (escolha == 1) {
                float lado = r.nextFloat(0, 100);
                float lado2 = r.nextFloat(0, 100);
                formas[i] = new Retangulo(lado, lado2);
                System.out.println("Retangulo adicionado com lados: " + lado + " e " + lado2 + "\n");
            } else {
                float lado = r.nextFloat(0, 100);
                formas[i] = new Quadrado(lado);
                System.out.println("Quadrado adicionado com lado: " + lado + "\n");
            }
        }

        for (Forma2D forma : formas) {
            System.out.println("Forma: " + forma.getClass().getSimpleName());
            System.out.println("Calculo da área: " + forma.calcularArea());
            System.out.println("Calculo do perimetro: " + forma.calcularPerimetro() + "\n");
        }
        System.out.println("-----------------------QUESTAO 6-----------------------");
    }
}
