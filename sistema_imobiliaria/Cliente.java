package sistema_imobiliaria;

import java.time.LocalDate;

public class Cliente extends Usuario {
    protected LocalDate dataCadastro;

    public Cliente(String nome, String cpf, String rg, String endereco, String cep, String telefone, String email,
            int codigoUsuario, String dataNascimento, LocalDate dataCadastro) {
        super(nome, cpf, rg, endereco, cep, telefone, email, codigoUsuario, dataNascimento);
        this.dataCadastro = dataCadastro;
    }
    public Cliente() {
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString(){
        return super.toString()+"Cadastro Realizado em: "+dataCadastro;
    }
}
