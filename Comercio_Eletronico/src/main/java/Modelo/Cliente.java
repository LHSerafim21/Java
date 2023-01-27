package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

import java.time.LocalDate;

public class Cliente extends Usuario {
    
    protected LocalDate dataCadastro;
    protected boolean ouro;
    
    public Cliente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email, boolean ouro){
        
        super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.ouro = ouro;
    }

    public LocalDate getDataCadastro(){
        return dataCadastro;
    }
    
    public void setDataCadastro(LocalDate dataCadastro){
        this.dataCadastro = LocalDate.now();
    }
    public boolean getOuro(){ return ouro;}
    
    public String clienteOuro(){
        if(this.ouro == true) return this.nome+" é cliente ouro";
        else return "";
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
                "\nEmail: " +email+
                "\nData do Cadastro: " +dataCadastro+
                clienteOuro();
    }
    
}   
    
