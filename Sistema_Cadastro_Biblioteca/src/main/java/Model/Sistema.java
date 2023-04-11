package Model;

import java.util.ArrayList;

public class Sistema {
    
    public static ArrayList<Livro> Livros = new ArrayList();
    static ArrayList<Notebook> Notebook = new ArrayList();
    static ArrayList<Item> Item = new ArrayList();
    public static String InfA;
    public static String InfB;
    
    public String getInfA(){
        return InfA;
    }
    
    public void setInfA(String InfA){
        Sistema.InfA = InfA;
    }
    
    public String getInfB(){
        return InfB;
    }
    
    public void setInfB(String InfB){
        Sistema.InfB = InfB;
    }
    
    public ArrayList getLivros(){
        return Livros;
    }
    
    public void setLivros(ArrayList Livros){
        Sistema.Livros = Livros;
    }
    
    public ArrayList getNotebook(){
        return Notebook;
    }
    
    public void setNotebook(ArrayList Notebook){
        Sistema.Notebook = Notebook;
    }
    
    public ArrayList getItem(){
        return Item;
    }
    
    public void setItem(ArrayList Item){
        Sistema.Item = Item;
    }
 
    public static void cadastrarLivro(int CodigoItem, boolean estaEmprestado, String editora, String nome){
        Livros.add(new Livro( CodigoItem, estaEmprestado, editora, nome));
    }
    
    public static void cadastrarNotebook(int CodigoItem, boolean estaEmprestado, String modelo, String marca, String processador){
        Notebook.add(new Notebook( CodigoItem, estaEmprestado, modelo, marca, processador));
    }
    
    public static String InserirTextAreaLivros(){
            
        for(Livro l : Livros){
            InfA += l.ToString();
            
        }   
        return InfA;
    }
    
    public static String InserirTextAreaNotebook(){
        
        for(Notebook n : Notebook){
            InfB += n.ToString();
            
        }   
        return InfB;
    }
    
}
