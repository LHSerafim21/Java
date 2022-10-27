package sistema_biblioteca;

public class AssistenteAdministrativo extends Usuario{

    private String inicioContrato;

    AssistenteAdministrativo(int CodigoUsuario, String Nome, String Cpf, String Email){
        super(CodigoUsuario, Nome, Cpf, Email);
    }
}