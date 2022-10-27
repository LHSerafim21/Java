package sistema_biblioteca;

public class Professor extends Usuario{

    private String titulacao;

    Professor(int CodigoUsuario, String Nome, String Cpf, String Email, String titulacao){
        super(CodigoUsuario, Nome, Cpf, Email);
        this.titulacao = titulacao;
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public String getTitulacao(){
        return titulacao;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public String toString(){
        return "Professor encontrado";
    }
}