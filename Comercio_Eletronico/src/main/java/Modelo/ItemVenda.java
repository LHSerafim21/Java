package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public class ItemVenda {
    
    private int codigoProduto;
    private float valor;
    private int quantidade;
    
    public ItemVenda(int codigoProduto, float valor, int quantidade){
        this.codigoProduto = codigoProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    public int getCodigoProduto(){
        return codigoProduto;
    }
    
    public void setCodigoProduto(int codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public float calcularTotalOuro(){
        return valor - (calcularTotal()*(3/100));
    }

    public float calcularTotal(){
        return valor*quantidade;
    }

    //Perguntar como obter o valor do produto através do codigo informado (Como relacionar codigoProduto com valor)
}
