package sistema_imobiliaria;

import java.util.ArrayList;

public class Imobiliaria {
    private String nome, endereco;
    private ArrayList<Aluguel> alugueis;
    private ArrayList<Venda> venda;
    private ArrayList<Imovel> imovel;
    private ArrayList<Usuario> clientes;
    private ArrayList<Usuario> corretores;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracoes;

    Imobiliaria(String nome, String endereco, ArrayList<Aluguel> alugueis, ArrayList<Venda> venda, ArrayList<Imovel> imovel, ArrayList<Usuario> clientes, ArrayList<Usuario> corretores, ArrayList<Seguro> seguros, Configuracao configuracoes){
        this.nome = nome;
        this.endereco = endereco;
        this.alugueis = alugueis;
        this.venda = venda;
        this.imovel = imovel;
        this.clientes = clientes;
        this.corretores = corretores;
        this.seguros = seguros;
        this.configuracoes = configuracoes;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public ArrayList<Aluguel> getAlugueis(){
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis){
        this.alugueis = alugueis;
    }

    public ArrayList<Venda> getVenda(){
        return venda;
    }

    public void setVenda(ArrayList<Venda> venda){
        this.venda = venda;
    }

    public ArrayList<Imovel> getImovel(){
        return imovel;
    }

    public void setImovel(ArrayList<Imovel> imovel){
        this.imovel = imovel;
    }

    public ArrayList<Usuario> getClientes(){
        return clientes;
    }

    public void setClientes(ArrayList<Usuario> clientes){
        this.clientes = clientes;
    }

    public ArrayList<Usuario> getCorretores(){
        return corretores;
    }

    public void setCorretores(ArrayList<Usuario> corretores){
        this.corretores = corretores;
    }

    public ArrayList<Seguro> getSeguros(){
        return seguros;
    }

    public void setSeguros(ArrayList<Seguro> seguros){
        this.seguros = seguros;
    }

    public Configuracao getConfiguracoes(){
        return configuracoes;
    }

    public void setConfiguracoes(Configuracao configuracoes){
        this.configuracoes = configuracoes;
    }
    //Analisar adicao de possiveis atributos de controle e adicionar os metodos necessarios 

}
