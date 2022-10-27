package sistema_biblioteca;

import java.util.Date;

public class AssistenteAdministrativo extends Usuario{

    private Date inicioContrato;
    private Date finalContrato;

    AssistenteAdministrativo(int CodigoUsuario, String Nome, String Cpf, String Email, Date inicioContrato, Date finalContrato){
        super(CodigoUsuario, Nome, Cpf, Email);
        this.inicioContrato = inicioContrato;
        this.finalContrato = finalContrato;
    }

    public Date getInicioContrato(){
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato){
        this.inicioContrato = inicioContrato;
    }
    
    public Date getFinalContrato(){
        return finalContrato;
    }

    public void setFinalContrato(Date finalContrato){
        this.finalContrato = finalContrato;
    }
    
    public String toString(){
        return "Assistente Administrativo encontrado!";
    }
}