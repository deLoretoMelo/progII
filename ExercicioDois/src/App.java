import pkg_questao_um.Departamento;
import pkg_questao_um.Pessoa;
import pkg_questao_um.Universidade;
import pkg_questao_dois.Elevador;

public class App {
    public static void main(String[] args) throws Exception {

        // Questão 1

        Universidade uni = new Universidade("UFPA");
        uni.getDeparts().add(new Departamento("Criação"));
        uni.getDeparts().add(new Departamento("Estudos"));
        uni.getDeparts().add(new Departamento("Segurança"));
        uni.getDeparts().add(new Departamento("Esportes"));
        uni.getDeparts().add(new Departamento("Admição"));
        uni.getDeparts().add(new Departamento("Saúde"));
        uni.getDeparts().add(new Departamento("Desenvolvimento"));
        uni.getDeparts().add(new Departamento("Justiça"));
        uni.getDeparts().add(new Departamento("Animais"));
        uni.getDeparts().add(new Departamento("Automação"));

        Departamento dep1 = new Departamento("Criação de Gado do Estado");
        dep1.getPessoas().add(new Pessoa("Eduardo", "sapeka@gmail.com", "91980807070"));
        dep1.getPessoas().add(new Pessoa("Rafael", "rafa@gmail.com", "91912345678"));

        Departamento dep2 = new Departamento("Segurança do Estado");
        dep2.getPessoas().add(new Pessoa("Murilo", "Forevez@gmail.com", "91987654321"));
        dep2.getPessoas().add(new Pessoa("Bob", "bob@gmail.com", "91900980012"));

        Departamento dep3 = new Departamento("Desenvolvimento do Estado");
        dep3.getPessoas().add(new Pessoa("Murilo", "Forevez@gmail.com", "91987654321"));
        dep3.getPessoas().add(new Pessoa("Bob", "bob@gmail.com", "91900980012"));

        uni.showDepsAndUni(uni.getDeparts());
        System.out.println();

        System.out.println("------------DEPARTAMENTOS---------------");
        dep1.showPeopleAndDep(dep1.getPessoas());
        System.out.println();

        dep2.showPeopleAndDep(dep2.getPessoas());
        System.out.println();

        dep3.showPeopleAndDep(dep3.getPessoas());
        System.out.println();

        // Questão 2
        System.out.println("------------ELEVADOR---------------");
        Elevador elevador = new Elevador(10, 7);
        System.out.println(elevador.Entra() + "\n");
        System.out.println(elevador.Entra() + "\n");
        System.out.println(elevador.sobe() + "\n");
        System.out.println(elevador.Entra() + "\n");
        System.out.println(elevador.sobe() + "\n");

        System.out.println(elevador);
    }
}
