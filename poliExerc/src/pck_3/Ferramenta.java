package pck_3;

// import java.util.HashSet;
// import java.util.Set;

public class Ferramenta implements Ferramentas {

    public Ferramenta() {
    }

    public void mostrarAnimais(Animal[] bichos) {
        for (Animal b : bichos) {
            System.out.println("Especie do animal: " + b.getEspecie());
            System.out.println("Nome do animal: " + b.getNomeAnimal() + "\n");
        }
    }

    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltro) {
        int tam = 0;
        for (int i = 0; i < completo.length; i++) {
            if (completo[i].getEspecie() == especieFiltro) {
                tam++;
            }
        }

        Animal[] novo = new Animal[tam];
        if (tam == 0) {
            return novo;
        }
        int j = 0;
        for (Animal b : completo) {
            if (b.getEspecie() == especieFiltro) {
                novo[j] = b;
                j++;
            }
        }
        return novo;
    }

    @Override
    public String[] classificaEspecies(Animal[] completo) {
        // Set<Animal> especies = new HashSet<>();
        // for (Animal b : completo) {
        // especies.add(b);
        // }
        // String[] especiesArray = new String[especies.size()];

        int n = completo.length;
        String[] unicas = new String[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            boolean jaExiste = false;

            for (int j = 0; j < contador; j++) {
                if (completo[i].getEspecie().equals(unicas[j])) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                unicas[contador] = completo[i].getEspecie();
                contador++;
            }
        }

        String[] resultado = new String[contador];
        System.arraycopy(unicas, 0, resultado, 0, contador);

        return resultado;
    }

}
