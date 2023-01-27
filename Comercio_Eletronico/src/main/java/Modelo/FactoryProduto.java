package Modelo;


import java.time.LocalDate;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public class FactoryProduto {

    public static Produto factoryMethod(String tipoProduto, int codigo, String nome, String descricao, LocalDate DataFabricacao, float valor, Fabricante fabricante){

        switch (tipoProduto) {
            
            case "Vestuario":
                
               return new Vestuario(codigo, nome, descricao, DataFabricacao, valor, fabricante);
            
            case "Eletronicos":
                
               return new Eletronicos(codigo, nome, descricao, DataFabricacao, valor, fabricante);
            
            case "Eletrodomesticos":
                
               return new Eletrodomesticos(codigo, nome, descricao, DataFabricacao, valor, fabricante);
        
            case "Moveis":
                
               return new Moveis(codigo, nome, descricao, DataFabricacao, valor, fabricante); 
        
            default:
                break;
        }
        return null;
    }

}
