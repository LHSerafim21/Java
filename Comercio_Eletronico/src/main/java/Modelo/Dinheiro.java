package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public abstract class Dinheiro extends Pagamento{
    
    public Dinheiro(int codigoNota){
        super(codigoNota);
    }
    
    @Override
    public abstract String toString();
    
}
