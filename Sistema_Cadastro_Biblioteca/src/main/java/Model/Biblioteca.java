package Model;

import java.util.ArrayList;

public class Biblioteca{

    private String nome;
    private ArrayList<Item> item;
    private ArrayList<Usuario> usuario;
    private ArrayList<Emprestimo> emprestimo;

    Biblioteca(String nome, ArrayList<Item> item, ArrayList<Usuario> usuario, ArrayList<Emprestimo> Emprestimo){
        this.nome = nome;
        this.item = item;
        this.usuario = usuario;
        this.emprestimo = Emprestimo;
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
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> Emprestimo){
        this.emprestimo = emprestimo;
    }

    //////////////////////////////////////////////////////////////////////////////

    public void addEmprestimo(Emprestimo emprestimo){
        this.emprestimo.add(emprestimo);
        System.out.println("Emprestimo Feito!!");
    }

    public void imprimirTodosEmprestimos(Emprestimo emprestimo){
        System.out.println("\nInformações" + this.emprestimo);
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