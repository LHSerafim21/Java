package sistema_biblioteca;

public class AssistenteAdministrativo extends Usuario{

    private String inicioContrato;
    private String finalContrato;

    AssistenteAdministrativo(int CodigoUsuario, String Nome, String Cpf, String Email, String inicioContrato, String finalContrato){
        super(CodigoUsuario, Nome, Cpf, Email);
        this.inicioContrato = inicioContrato;
        this.finalContrato = finalContrato;
    }

    public String getInicioContrato(){
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato){
        this.inicioContrato = inicioContrato;
    }
    
    public String getFinalContrato(){
        return finalContrato;
    }

    public void setFinalContrato(String finalContrato){
        this.finalContrato = finalContrato;
    }
    
    public String toString(){
        return "Assistente Administrativo encontrado!";
    }
}