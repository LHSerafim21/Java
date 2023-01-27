package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public abstract class Pagamento {
    
    private int codigoNota;
    
    public Pagamento(int codigoNota){
        this.codigoNota = codigoNota;
    }
    
    public int getCodigoNota(){
        return codigoNota;
    }
    
    public void setCodigoNota(int codigoNota){
        this.codigoNota = codigoNota;
    }
    
    public abstract String toString();
}
