package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public class Transportadora {
    
    private int codigo;
    private String cnpj;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private int tempoDeEntrega;
    
    public Transportadora( int codigo, String cnpj, String nome, String email, String telefone, String endereco, int tempoDeEntrega){
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tempoDeEntrega = tempoDeEntrega;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
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
    
    public int getTempoDeEntrega(){
        return tempoDeEntrega;
    }
    
    public void setTempoDeEntrega(int tempoDeEntrega){
        this.tempoDeEntrega = tempoDeEntrega;
    }
    
    @Override
    public String toString(){
        return  "Codigo: " +codigo+
                "\nNome: " +nome+
                "\nCnpj: " +cnpj+
                "\nTempo de Entrega: " +tempoDeEntrega+
                "\nEmail: " +email+
                "\nTelefone: " +telefone+
                "\nEndereco: " +endereco;
    }
}
