package sistema_biblioteca;

import java.util.ArrayList;

public class Biblioteca{

    private String nome;
    private ArrayList<Item> item;
    private ArrayList<Usuario> usuario;
    private ArrayList<Emprestimo> Emprestimo;

    Biblioteca(String nome, ArrayList<Item> item, ArrayList<Usuario> usuario, ArrayList<Emprestimo> Emprestimo){
        this.nome = nome;
        this.item = item;
        this.usuario = usuario;
        this.Emprestimo = Emprestimo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Item> getItem(){
        return item;
    }

    public void setItem(ArrayList<Item> item){
        this.item = item;
    }

    public ArrayList<Usuario> getUsuario(){
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario){
        this.usuario = usuario;
    }

    public ArrayList<Emprestimo> getEmprestimo(){
        return Emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> Emprestimo){
        this.Emprestimo = Emprestimo;
    }

    //////////////////////////////////////////////////////////////////////////////

    public void addEmprestimo(Emprestimo emprestimo){
        this.Emprestimo.add(emprestimo);
        System.out.println("Emprestimo Feito!!");
    }

    public void imprimirTodosEmprestimos(Emprestimo emprestimo){
        System.out.println("\nInformações" + this.Emprestimo);
    }

    public void imprimirEmprestimosUsuarios(){
        System.out.println("");
    }

    public void imprimirLivrosEmprestados(){
        System.out.println("Livros Emprestado: ");
    }

    public void imprimirNotebooksEmprestados(){
        System.out.println("");
    }
}
