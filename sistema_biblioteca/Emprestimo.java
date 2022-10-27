package sistema_biblioteca;

import java.util.ArrayList;

public class Emprestimo{

    private int codigoEmprestimo;
    private int codigoUsuario;
    private ArrayList<Item> Item;

    Emprestimo(int codigoEmprestimo, int codigoUsuario, ArrayList<Item> Item){
        this.codigoEmprestimo = codigoEmprestimo;
        this.codigoUsuario = codigoUsuario;
        this.Item = Item;
    }

    public int getCodigoEmprestimo(){
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(int codigoEmprestimo){
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public int getCodigoUsuario(){
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario){
        this.codigoUsuario = codigoUsuario;
    }

    public ArrayList<Item> getItem(){
        return Item;
    }

    public void setItem(ArrayList<Item> Item){
        this.Item = Item;
    }

    ///////////////////////////////////////////////////////////////////////////

    public void CalcularDataDevolucao(int CodigoUsuario){

        if(CodigoUsuario == 01){

        }

        if(CodigoUsuario == 02){
            
        }

        if(CodigoUsuario == 03){
            
        }

    }
}