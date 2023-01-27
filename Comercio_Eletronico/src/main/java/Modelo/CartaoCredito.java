package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public class CartaoCredito extends Pagamento{
       
        private String nome;
        private String bandeira;
        private String  numero;
        
    public CartaoCredito(String nome, String bandeira, String numero, int codigoNota){
        super(codigoNota);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getBandeira(){
        return bandeira;
    }
    
    public void setBandeira(String bandeira){
        this.bandeira = bandeira;
    }
    
    @Override
    public String toString(){
        return  "\nNome: " +nome+
                "\nNumero: " +numero+
                "\nBandeira: " +bandeira+
                "\nCodigo da Nota: " +getCodigoNota();
    }
}
