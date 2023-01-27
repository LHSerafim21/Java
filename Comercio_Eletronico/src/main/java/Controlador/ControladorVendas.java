/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ComercioEletronico;
/**
 *
 * @author Henrique
 */
public class ControladorVendas {
    private ComercioEletronico comercio = new ComercioEletronico();
    
    public ControladorVendas(){}
    
    public String listarVendasCadastradas(){return comercio.listarVendasCadastradas();}
    //Listar Vendas de Um mês especifico
    public String listarVendasDinheiro(){return comercio.listarVendasDinheiro();}
    public String listarVendasCartao(){return comercio.listarVendasCartao();}
    public String listarVendasPix(){return comercio.listarVendasPix();}
}
