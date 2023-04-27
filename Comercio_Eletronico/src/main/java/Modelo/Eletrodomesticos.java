package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

import java.time.LocalDate;

public class Eletrodomesticos extends Produto {

    public Eletrodomesticos(int codigo, String nome, String descricao, LocalDate DataFabricacao, float valor, Fabricante fabricante){
        super(codigo, nome, descricao,DataFabricacao, valor, fabricante);
        
    }
        
    @Override
    public float calcularValor(){
        
        valor= (((350/100)/100) * valor) + valor;
        
        return valor;
    }

    @Override
    public String toString(){
        return  "Codigo: " +codigo+
                "\nNome: " +nome+
                "\nDescricao: " +descricao+
                "\nData de Fabricacao: " +DataFabricacao+
                "\nValor: " +valor+
                "\nFabricante: " +fabricante.getCodigo()+
                "\nEsta Disponivel: " +disponivel;
    }
    
}