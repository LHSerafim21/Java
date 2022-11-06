import java.time.LocalDate;

public class Corretor extends Usuario {
    protected String creci, pis;
    protected float salario;
    protected LocalDate dataAdmissao;
    
    public Corretor(String nome, String cpf, String rg, String endereco, String cep, String telefone, String email,
            int codigoUsuario, String dataNascimento, String creci, String pis, float salario, LocalDate dataAdmissao) {
        super(nome, cpf, rg, endereco, cep, telefone, email, codigoUsuario, dataNascimento);
        this.creci = creci;
        this.pis = pis;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
    public Corretor() {
    }

    public String getCreci() {
        return creci;
    }
    public void setCreci(String creci) {
        this.creci = creci;
    }
    public String getPis() {
        return pis;
    }
    public void setPis(String pis) {
        this.pis = pis;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString(){
        return super.toString()+"CRECI: "+creci+" | PIS: "+pis+"\nSalario: R$ "+salario
                +" | Data de Admissão: "+dataAdmissao;
    }
}
