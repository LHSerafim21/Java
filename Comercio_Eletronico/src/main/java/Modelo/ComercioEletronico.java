package Modelo;

/**
 * @author Henrique
 * @author Nazaro
 * @author Ikeda
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ComercioEletronico {
    
    private static String nomeLoja = "HENRIKEZARO";
    private static ArrayList<Venda> vendas = new ArrayList();
    private static ArrayList<Produto> produtos = new ArrayList();
    private static ArrayList<Fabricante> fabricantes = new ArrayList();
    private static ArrayList<Transportadora> transportadoras = new ArrayList();
    private static ArrayList<Usuario> clientes = new ArrayList();
    private static ArrayList<Usuario> gerentes = new ArrayList();
    
    public ComercioEletronico(){}
    
    public String getNomeLoja(){return nomeLoja;}
    public void setNomeLoja(String nomeLoja){this.nomeLoja = nomeLoja;}
    public ArrayList<Venda> getVendas(){return vendas;}
    public void setVenda(ArrayList<Venda> vendas){this.vendas = vendas;}
    public ArrayList<Produto> getProdutos(){return produtos;}
    public void setProdutos(ArrayList<Produto> produtos){this.produtos = produtos;}
    public ArrayList<Fabricante> getFabricantes(){return fabricantes;}
    public void setFabricantes(ArrayList<Fabricante> fabricantes){this.fabricantes = fabricantes;}
    public ArrayList<Transportadora> gettransportadoras(){return transportadoras;}
    public void settransportadoras(ArrayList<Transportadora> transportadoras){this.transportadoras = transportadoras;}
    public ArrayList<Usuario> getClientesOuro(){return clientes;}
    public void setClientes(ArrayList<Usuario> clientes){this.clientes = clientes;}
    public ArrayList<Usuario> getGerentes(){return gerentes;}
    public void setGerentes(ArrayList<Usuario> gerentes){this.gerentes = gerentes;}  
    
    ////////////////////////////////////////////////////////////////////////////
    
    public static void addCliente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, 
                            String cep, String email, boolean ouro){
        clientes.add(new Cliente(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email, ouro));
    }
    
    public static void addProduto(String tipoProduto, int codigo, String nome, String descricao, LocalDate DataFabricacao,
            float valor, String fabricante){
        Iterator<Produto> iterator = produtos.iterator();
        Fabricante f = null;
        while(iterator.hasNext()){
            if(iterator.next().getFabricante().getNome().equalsIgnoreCase(fabricante)){
                f = iterator.next().getFabricante();
            }
        }
        produtos.add(FactoryProduto.factoryMethod(tipoProduto, codigo, nome, descricao, DataFabricacao, valor, f));
    }
    
    public static void addGerente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
                            String cep, String email, float salario, String pis, LocalDate dataAdmissao){
        gerentes.add(new Gerente(salario, pis, dataAdmissao, codigo, nome, cpf, rg, dataNascimento, endereco, cep, email));
    }
    
    public static void addTransportadora(int codigo, String cnpj, String nome, String email, String telefone,
            String endereco, int tempoDeEntrega){
        transportadoras.add(new Transportadora(codigo, cnpj, nome, email, telefone, endereco, tempoDeEntrega));
    }
    
    public static void addFabricante(int codigo, String nome, String cnpj, String descricao, String email,
            String telefone, String endereco){
        fabricantes.add(new Fabricante(codigo, nome, cnpj, descricao, email, telefone, endereco));
    }

    ////////////////////////////////////////////////////////////////////////////
    
    public static String listarProdutosCadastrados(){
        Iterator<Produto> iterator = produtos.iterator();
        String s = "";
        while(iterator.hasNext()){
            iterator.next();
            s = s + iterator.next().toString() + "\n";
        }return s;
    }
    
    public static String listarMoveis(){

        Iterator<Produto> iterator = produtos.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next() instanceof Moveis){
                s = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarEletrodomesticos(){
        Iterator<Produto> iterator = produtos.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next() instanceof Eletrodomesticos){
                s = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarEletronicos(){
        Iterator<Produto> iterator = produtos.iterator();
        String s = "Eletronicos cadastrados: \n";
        while(iterator.hasNext()){
            if(iterator.next() instanceof Eletronicos){
                s = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarVestuarios(){
        Iterator<Produto> iterator = produtos.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next() instanceof Vestuario){
                s = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarProdutoMaisVendido(){
        Iterator<Produto> produterator = produtos.iterator();
        Iterator<Venda> vendarator = vendas.iterator();
        String s = "";
        while(vendarator.hasNext()){
            for(ItemVenda iv : vendarator.next().getItensVenda()){
            }
            
        }
        
        return "";
    }
    
    public static String listarTodosOsProdutosOrdenadosPorValorOrdenacaoA(){
        return listarTodosOsProdutosOrdenados("QUICKSORT");
    }
    public static String listarTodosOsProdutosOrdenadosPorValorOrdenacaoB(){
        return listarTodosOsProdutosOrdenados("BUBBLESORT");
    }
    
    public static String listarFabricantesCadastrados(){
        Iterator<Fabricante> iterator = fabricantes.iterator();
        String s = "";
        while(iterator.hasNext()){
            s = s + iterator.next().toString() + "\n";
        }return s;
    }
    
    //Falta Fabricante mais produtos vendido
    //Falta Fabricante maior lucro
    
    public static String listarTransportadorasCadastrados(){
        Iterator<Transportadora> iterator = transportadoras.iterator();
        String s = "";
        while(iterator.hasNext()){
               s = s + iterator.next().toString() + "\n";
        }return s;
    }
    
    //Falta Transportadora mais transportes realizados
    
    public static String listarGerentesCadastrados(){
        Iterator<Usuario> iterator = gerentes.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next() instanceof Gerente){
               s = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarClientesCadastrados(){
        Iterator<Usuario> iterator = clientes.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next() instanceof Cliente){
               s = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarClientesOuroCadastrados(){
        Iterator<Usuario> iterator = clientes.iterator();
        String s = "";
        while(iterator.hasNext()){
               s = s + iterator.next().toString() + "\n";
            }return s;
    }
    
    //Historico de um Cliente
    
    public static String listarVendasCadastradas(){
        Iterator<Venda> iterator = vendas.iterator();
        String s = "";
        while(iterator.hasNext()){
               s = s + iterator.next().toString() + "\n";
        }return s;
    }
    
    public static String listarVendasporMes(LocalDate mes){
        Iterator<Venda> iterator = vendas.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next().getDataVenda().getMonth().equals(mes.getMonth())){
                s += iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarVendasDinheiro(){
        Iterator<Venda> iterator = vendas.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next().getFormaPagamento() instanceof Dinheiro){
               s = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarVendasCartao(){
        Iterator<Venda> iterator = vendas.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next().getFormaPagamento() instanceof CartaoCredito){
               s =  s + iterator.next().toString() + "\n";
            }
        }return s;
    }   
    
    public static String listarVendasPix(){
        Iterator<Venda> iterator = vendas.iterator();
        String s = "";
        while(iterator.hasNext()){
            if(iterator.next().getFormaPagamento() instanceof Pix){
               s  = s + iterator.next().toString() + "\n";
            }
        }return s;
    }
    
    public static String listarTodosOsProdutosOrdenados(String tipo){
        Contexto contexto = new Contexto();
        ArrayList<Produto> Ordenados = new ArrayList();

        contexto.setStrategy(tipo);
        contexto.executarOrdenacao(Ordenados);

        Iterator<Produto> iterator = Ordenados.iterator();
        String s="Produtos ordenados por valor: \n";
        while(iterator.hasNext()){
            s+= iterator.next().toString() + "\n";
        }

        return s;
    }

    public static List<String> getFabricanteMaisProdutosVendidos(List<Produto> produtos, int limite) {
       
        Map<String, Integer> ContagemDeVendaFabricaca = new HashMap<>();  
        
        for (Produto produto : produtos) {
            
            String fabricar = produto.getFabricante().getNome();      
            
            if (ContagemDeVendaFabricaca.containsKey(fabricar)) {         // Verifica se já existe uma contagem de vendas para esse fabricante
                // Se sim, incrementa a contagem de vendas para esse fabricante
                ContagemDeVendaFabricaca.put(fabricar, ContagemDeVendaFabricaca.get(fabricar) + 1);
            } else {
                // Se não, adiciona uma nova contagem de vendas para esse fabricante com o valor 1
                ContagemDeVendaFabricaca.put(fabricar, 1);
            }
        }
        // Converte o mapa em uma lista ordenada de entradas
        List<Map.Entry<String, Integer>> ClassificarContagemDeVendaFabricaca = new ArrayList<>(ContagemDeVendaFabricaca.entrySet());
       
        ClassificarContagemDeVendaFabricaca.sort((o1, o2) -> o2.getValue() - o1.getValue());
        
        List<String> topfabricantes = new ArrayList<>();
        
        for (int i = 0; i < Math.min(limite, ClassificarContagemDeVendaFabricaca.size()); i++) {
           
            topfabricantes.add(ClassificarContagemDeVendaFabricaca.get(i).getKey());
        }
        
        return topfabricantes;
    }

    public static List<String> getListarFabricantesMaiorLucro(List<Produto> produtos, int limite) {
        
        Map<String, Double> fabricanteLucro = new HashMap<>();
        
        for (Produto produto : produtos) {
            
            String fabricar = produto.getFabricante().getNome();
           
            double lucro = produto.lucro();
            
            if (fabricanteLucro.containsKey(fabricar)) {
                // Se sim, adiciona o lucro do produto atual ao lucro total para esse fabricante
                fabricanteLucro.put(fabricar, fabricanteLucro.get(fabricar) + lucro);
            } else {
                // Se não, adiciona um novo lucro total para esse fabricante com o valor do lucro do produto atual
                fabricanteLucro.put(fabricar, lucro);
            }
        }
        
        List<Map.Entry<String, Double>> ClassificarfabricanteLucro = new ArrayList<>(fabricanteLucro.entrySet());
        
        ClassificarfabricanteLucro.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        
        List<String> topfabricantes = new ArrayList<>();
        
        for (int i = 0; i < Math.min(limite, ClassificarfabricanteLucro.size()); i++) {
            
            topfabricantes.add(ClassificarfabricanteLucro.get(i).getKey());
        }
        
        return topfabricantes;
    }
    
    public static List<String> getTransportadorasMaisTransportesRealizados(List<Transportadora> transportadoras, int limite) {
        
        Map<String, Integer> ContagemTransportes = new HashMap<>();
        
        for (Transportadora transportadora : transportadoras) {
            
            String x = ((Venda) transportadoras).getTransportadora().getNome();
            
            if (ContagemTransportes.containsKey(x)) {
                // Se sim, adiciona 1 à contagem de transportes para essa transportadora
                ContagemTransportes.put(x, ContagemTransportes.get(x) + 1);
            } else {
                // Se não, adiciona uma nova contagem de transportes para essa transportadora com o valor 1
                ContagemTransportes.put(x, 1);
            }
        }
        // Converte o mapa em uma lista ordenada de entradas
        List<Map.Entry<String, Integer>> ClassificarContagemTransportes = new ArrayList<>(ContagemTransportes.entrySet());
        // Ordena a lista de entradas por contagem de transportes
        ClassificarContagemTransportes.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        
        List<String> topxs = new ArrayList<>();
        
        for (int i = 0; i < Math.min(limite, ClassificarContagemTransportes.size()); i++) {
           
            topxs.add(ClassificarContagemTransportes.get(i).getKey());
        }
        
        return topxs;
    }
    
    public static List<Venda> getHistoricoDeVendasCliente(List<Venda> vendas, String cliente) {
        
        List<Venda> HistoricoDeVendasCliente = new ArrayList<>();
        
        for (Venda venda : vendas) {
            // Verifica se o ID do cliente da venda atual corresponde ao ID do cliente específico
            if (venda.getCliente().equals(cliente)) {
                // Se sim, adiciona a venda atual à lista de vendas do cliente específico
                HistoricoDeVendasCliente.add(venda);
            }
        }
    
        return HistoricoDeVendasCliente;
    }
    
}