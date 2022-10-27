package sistema_biblioteca;

public class Aluno extends Usuario{

    private String curso;
    private int ano;

    Aluno(int CodigoUsuario, String Nome, String Cpf, String Email, String curso, int ano){
        super(CodigoUsuario, Nome, Cpf, Email);
        this.curso = curso;
        this.ano = ano;
    }

    /////////////////////////////////////////////////////////////////////////////

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    ////////////////////////////////////////////////////////////////////////////

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    ////////////////////////////////////////////////////////////////////////////

    public String toString(){
        return "Aluno encontrado";
    }
}