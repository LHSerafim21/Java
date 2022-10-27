package sistema_biblioteca;

public class Usuario {

    private int CodigoUsuario;
    private String Nome;
    private String Cpf;
    private String Email;

    //###############################################################################//

    Usuario(int CodigoUsuario, String Nome, String Cpf, String Email){
        this.CodigoUsuario = CodigoUsuario;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Email = Email;
    }

    //##############################################################################//

    public int getCodigoUsuario(){
        return CodigoUsuario;
    }

    public void setCodigoUsuario(int CodigoUsuario){
        this.CodigoUsuario = CodigoUsuario;
    }

    ////////////////////////////////////////////////////////////////////////////////

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    ///////////////////////////////////////////////////////////////////////////////

    public String getCpf(){
        return Cpf;
    }

    public void setCpf(String Cpf){
        this.Cpf = Cpf;
    }

    ///////////////////////////////////////////////////////////////////////////////

    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    //###########################################################################//

    public String toString(){
        return "Usuario Encontrado!!!!";
    }
}

