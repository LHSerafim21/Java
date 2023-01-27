/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 * @author Henrique
 * @author Nazaro
 * @author Ikeda
 */

import Modelo.ComercioEletronico;

public class ControladorTransportadora {
    private ComercioEletronico comercio;
      
      public ControladorTransportadora(){
        comercio = new ComercioEletronico();
      }
      
      public void addTransportadora(int codigo, String cnpj, String nome, String email, String telefone, String endereco, int tempoDeEntrega){
          comercio.addTransportadora(codigo, cnpj, nome, email, telefone, endereco, tempoDeEntrega);
      }
      
      public String listarTransportadorasCadastrados(){return comercio.listarTransportadorasCadastrados();}
}
