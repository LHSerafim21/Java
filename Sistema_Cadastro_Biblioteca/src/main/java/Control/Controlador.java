package Control;

import Model.Livro;
import java.util.Iterator;
import Model.Sistema;
import static Model.Sistema.InfA;
import static Model.Sistema.InfB;
import static Model.Sistema.Livros;
import java.util.ArrayList;


public class Controlador {

    public static void CadastrarDadosLivros(int CodigoItem, boolean estaEmprestado, String editora, String nome){
        Sistema.cadastrarLivro(CodigoItem, estaEmprestado, editora, nome);     
    }
    
    public static void CadastrarDadosNotebook(int CodigoItem, boolean estaEmprestado, String modelo, String marca, String processador){
        Sistema.cadastrarNotebook(CodigoItem, estaEmprestado, modelo, marca, processador);
    }
    
    public static String EscreverLivros(){
        return Sistema.InserirTextAreaLivros();   
    }
    
    public static String EscreverNotebooks(){
        return Sistema.InserirTextAreaNotebook();
    }
}
