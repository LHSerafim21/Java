package sistema_imobiliaria;

import java.util.ArrayList;

public class Imobiliaria {
    private String nome, endereco;
    private ArrayList<Aluguel> alugueis;
    private ArrayList<Venda> venda;
    private ArrayList<Imovel> imovel;
    private ArrayList<Usuario> clientes;
    private ArrayList<Usuario> corretores;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracoes;

    Imobiliaria(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    //TODO - Analisar adicao de possiveis atributos de controle e adicionar os metodos necessarios + construtores + getters and setters

}
