package Model;

import java.util.Date;
import java.util.ArrayList;

public class Emprestimo{

    private int codigoEmprestimo;
    private int codigoUsuario;
    private ArrayList<Item> Item;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    Emprestimo(int codigoEmprestimo, int codigoUsuario, ArrayList<Item> Item, Date dataDevolucao, Date dataEmprestimo){
        this.codigoEmprestimo = codigoEmprestimo;
        this.codigoUsuario = codigoUsuario;
        this.Item = Item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao =  dataDevolucao;
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

    public Date getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao(){
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

    ///////////////////////////////////////////////////////////////////////////

    public void CalcularDataDevolucao(int CodigoUsuario){
        if(CodigoUsuario == 01){
            //return dataDevolucao = dataDevolucao.
        }
        
        if(CodigoUsuario == 02){
            //return dataDevolucao = dataDevolucao.
        }
    
        if(CodigoUsuario == 03){
            //return dataDevolucao = dataDevolucao.
        }
    
    }
}
