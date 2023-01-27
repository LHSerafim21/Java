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

public class ControladorFabricante {
    private ComercioEletronico comercio;
      
      public ControladorFabricante(){
        comercio = new ComercioEletronico();
      }
      
      public void addFabricante(int codigo, String nome, String cnpj, String descricao, String email, String telefone, String endereco){
          comercio.addFabricante(codigo, nome, cnpj, descricao, email, telefone, endereco);
      }
      
      public String listarFabricantesCadastrados(){return comercio.listarFabricantesCadastrados();}
}
