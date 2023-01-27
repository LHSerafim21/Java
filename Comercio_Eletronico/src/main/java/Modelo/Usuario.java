package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

import java.time.LocalDate;
        
public class Usuario {
    
    protected int codigo;
    protected String nome;
    protected String cpf;
    protected String rg;
    protected LocalDate dataNascimento;
    protected String endereco;
    protected String cep;
    protected String email;
            
    Usuario(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email){
        
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
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
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getRg(){
        return rg;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        return  "Codigo: " +codigo+
                "\nNome: " +nome+
                "\nCpf: " +cpf+
                "\nRg: " +rg+
                "\nData de Nascimento: " +dataNascimento+
                "\nEndereco: " +endereco+
                "\nCep: " +cep+
                "\nEmail: " +email;
    }
}
