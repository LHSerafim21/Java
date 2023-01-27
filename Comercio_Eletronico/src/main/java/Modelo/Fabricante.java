package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public class Fabricante {
    
    private int codigo;
    private String nome;
    private String cnpj;
    private String descricao;
    private String email;
    private String telefone;
    private String endereco;
    
    public Fabricante(int codigo, String nome, String cnpj, String descricao, String email, String telefone, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.descricao = descricao;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
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
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    ////////////////////////////////////////////////////////////
    
    @Override
    public String toString(){
        return  "Codigo: " +codigo+
                "\nNome: " +nome+
                "\nCnpj: " +cnpj+
                "\nDescricao: " +descricao+
                "\nEmail: " +email+
                "\nTelefone: " +telefone+
                "\nEndereco: " +endereco;
    }
    
    
}
