package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 * @author Ikeda
 */

import java.time.LocalDate;

public abstract class Produto{
    
    protected int codigo;
    protected String nome;
    protected String descricao;
    protected LocalDate DataFabricacao;
    protected float valor;
    protected Fabricante fabricante;
    protected boolean disponivel;

    public Produto(int codigo, String nome, String descricao, LocalDate DataFabricacao, float valor, Fabricante fabricante){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.DataFabricacao = DataFabricacao;
        this.valor = valor;
        this.fabricante = fabricante;
        this.disponivel = true;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao( String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataFabricacao(){
        return DataFabricacao;
    }

    public void setDataFabricacao(LocalDate DataFabricacao){
        this.DataFabricacao = DataFabricacao;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public Fabricante getFabricante(){
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    ////////////////////////////////////////////////////////////////////////////
    
    public abstract float calcularValor();

    public boolean estaDisponivel(Produto p){
        return p.getDisponivel()==true;
    }

    public float lucro(){
        float lucro;
        return (float) (lucro = calcularValor() - valor);
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