package sistema_biblioteca;

import java.util.ArrayList;

public class Biblioteca{

    private String nome;
    private ArrayList<Item> Item;
    private ArrayList<Usuario> Usuario;
    private ArrayList<Emprestimo> Emprestimo;

    Biblioteca(String nome, ArrayList<Item> Item, ArrayList<Usuario> Usuario, ArrayList<Emprestimo> Emprestimo){
        this.nome = nome;
        this.Item = Item;
        this.Usuario = Usuario;
        this.Emprestimo = Emprestimo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Item> getItem(){
        return Item;
    }

    public void setItem(ArrayList<Item> Item){
        this.Item = Item;
    }

    public ArrayList<Usuario> getUsuario(){
        return Usuario;
    }

    public void setUsuario(ArrayList<Usuario> Usuario){
        this.Usuario = Usuario;
    }

    public ArrayList<Emprestimo> getEmprestimo(){
        return Emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> Emprestimo){
        this.Emprestimo = Emprestimo;
    }

    //////////////////////////////////////////////////////////////////////////////

    public void addEmprestimo(Emprestimo emprestimo){
        
    }

    public void imprimirTodosEmprestimos(){
        System.out.println("");
    }

    public void imprimirEmprestimosUsuarios(){
        System.out.println("");
    }

    public void imprimirLivrosEmprestados(){
        System.out.println("");
    }

    public void imprimirNotebooksEmprestados(){
        System.out.println("");
    }
}
