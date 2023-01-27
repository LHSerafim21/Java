package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

import java.time.LocalDate;

public class Gerente extends Usuario {
    
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;
    
    public Gerente(float salario, String pis, LocalDate dataAdmissao , int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email){
        
        super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public String getPis(){
        return pis;
    }
    
    public void setPis(String pis){
        this.pis = pis;
    }
    
    public LocalDate getDataAdmissao(){
        return dataAdmissao;
    }
    
    public void setDataAdmissao(LocalDate dataAdmissao){
        this.dataAdmissao = LocalDate.now();
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
                "\nSalario: " +salario+
                "\nPis: " +pis+
                "\nData de Admissao: " +dataAdmissao;
    }
}
