package Controlador;


import Modelo.ComercioEletronico;
import java.time.LocalDate;
/**
 * @author Nazaro
 * @author Henrique
 * @author Ikeda
 */

public class ControladorProduto {
    
    
    public ControladorProduto(){
        
    }
    public void addProduto(String tipoProduto, int codigo, String nome, String descricao, LocalDate DataFabricacao, float valor, String fabricante){
                ComercioEletronico.addProduto(tipoProduto, codigo, nome, descricao, DataFabricacao, valor, fabricante);

    }
    
    public String listarProdutosCadastrados(){return ComercioEletronico.listarProdutosCadastrados();}
    public String listarMoveis(){return ComercioEletronico.listarMoveis();}
    public String listarEletrodomesticos(){return ComercioEletronico.listarEletrodomesticos();}
    public String listarEletronicos(){return ComercioEletronico.listarEletronicos();}
    public String listarVestuarios(){return ComercioEletronico.listarVestuarios();}
    public String listarProdutosMaisVendidos(){return "Desculpe o transtorno, estamos em manutenção";}    
    public String listarTodosOsProdutosOrdenadosPorValorOrdenacaoA(){return ComercioEletronico.listarTodosOsProdutosOrdenadosPorValorOrdenacaoA();}
    public String listarTodosOsProdutosOrdenadosPorValorOrdenacaoB(){return ComercioEletronico.listarTodosOsProdutosOrdenadosPorValorOrdenacaoB();}
}
