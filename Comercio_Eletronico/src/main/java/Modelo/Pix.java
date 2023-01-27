package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

import java.util.Random;

public class Pix extends Pagamento{
        
    private String codigoPix;
    
    public Pix(String codigoPix, int codigoNota){
        super(codigoNota);
        this.codigoPix = codigoPix;
    }
    
    public String getCodigoPix(){
        return codigoPix;
    } 
    
    public void setCodigoPix(String codigoPix){
        this.codigoPix = codigoPix;
    }
    
    public class gerarCodigoPix {

        public static String getRandom11NumerosString() {
            String numeros = "";
            Random random = new Random();
    
            for (int i = 0; i < 11; i++) {
                numeros += String.valueOf(random.nextInt(10));
            }
    
            return numeros;
        }
    
        public static void main(String[] args) {
            String numeros = getRandom11NumerosString();
            System.out.println(numeros);
        }
        
    }
    
    @Override
    public String toString(){
        return  "\nCodigo do Pix: " +codigoPix+
                "\nCodigo da Nota: " +getCodigoNota();
    }
}
