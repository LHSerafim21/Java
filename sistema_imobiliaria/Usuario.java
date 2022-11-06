package sistema_imobiliaria;

import java.time.LocalDate;

public abstract class Usuario{
    protected String nome, cpf, rg, endereco, cep, telefone, email;
    protected int codigoUsuario;
    protected LocalDate dataNascimento;
    
    public Usuario() {
    }
    public Usuario(String nome, String cpf, String rg, String endereco, String cep, String telefone, String email,
            int codigoUsuario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.codigoUsuario = codigoUsuario;
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCodigoUsuario() {
        return codigoUsuario;
    }
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }

    public String toString(){
        return codigoUsuario+" | "+nome+"\nRG: "+rg+" | CPF: "+cpf+" | Data Nasc.: "+dataNascimento
                +"\nTel: "+telefone+" | Email: "+email+"\nEndereco: "+endereco+" | CEP: "+cep;
    }
}