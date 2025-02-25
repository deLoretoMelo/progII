package pck_4;

public class Operacao implements OperacoesBanco {

    public Operacao() {}

    @Override
    public Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado) {
        for(Correntista c : todosCorrentistas){
            if(c.getCpfCliente().equals(cpfProcurado)){
                return c;
            }
        }

        return null;
    }
    
}
