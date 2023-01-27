package Controlador;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

import Modelo.ComercioEletronico;
import java.time.LocalDate;

public class ControladorUsuario {
      private ComercioEletronico comercio;
      
      public ControladorUsuario(){
        comercio = new ComercioEletronico();
      }
      
      public void addCliente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email, boolean ouro){
          comercio.addCliente(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email, ouro);
      }
      
      public void addGerente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
                            String cep, String email, float salario, String pis, LocalDate dataAdmissao){
          comercio.addGerente(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email, salario, pis, dataAdmissao);
      }  
      
      public String listarGerentesCadastrados(){return comercio.listarGerentesCadastrados();}
      public String listarClientesCadastrados(){return comercio.listarClientesCadastrados();}
      public String listarClientesOuroCadastrados(){return comercio.listarClientesOuroCadastrados();}
    //Historico de um Cliente     
}
