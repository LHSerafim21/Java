package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

public class Configuracao {
    private String arquivosVendas;
    private String arquivoProdutos;
    private String arquivoFabricantes;
    private String arquivosTransportadoras;
    private String arquivosClientes;
    private String arquivosGerentes;

    public Configuracao(String arquivosVendas, String arquivoProdutos, String arquivoFabricantes,
            String arquivosTransportadoras, String arquivosClientes, String arquivosGerentes) {
        this.arquivosVendas = arquivosVendas;
        this.arquivoProdutos = arquivoProdutos;
        this.arquivoFabricantes = arquivoFabricantes;
        this.arquivosTransportadoras = arquivosTransportadoras;
        this.arquivosClientes = arquivosClientes;
        this.arquivosGerentes = arquivosGerentes;
    }

    public String getArquivosVendas() {return arquivosVendas;}
    public void setArquivosVendas(String arquivosVendas) {this.arquivosVendas = arquivosVendas;}
    public String getArquivoProdutos() {return arquivoProdutos;}
    public void setArquivoProdutos(String arquivoProdutos) {this.arquivoProdutos = arquivoProdutos;}
    public String getArquivoFabricantes() {return arquivoFabricantes;}
    public void setArquivoFabricantes(String arquivoFabricantes) {this.arquivoFabricantes = arquivoFabricantes;}
    public String getArquivosTransportadoras() {return arquivosTransportadoras;}
    public void setArquivosTransportadoras(String arquivosTransportadoras) {this.arquivosTransportadoras = arquivosTransportadoras;}
    public String getArquivosClientes() {return arquivosClientes;}
    public void setArquivosClientes(String arquivosClientes) {this.arquivosClientes = arquivosClientes;}
    public String getArquivosGerentes() {return arquivosGerentes;}
    public void setArquivosGerentes(String arquivosGerentes) {this.arquivosGerentes = arquivosGerentes;}
    {
    
        /*public static String lerVendas(){
        String conteudo = "";
        try {
            FileReader arq = new FileReader("arquivoVendas.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while(linha != null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException ex){
                conteudo = "ERRO1"; //Não conseguiu ler
            }
        } catch (FileNotFoundException ex){
            conteudo = "ERRO2"; //Não encontrou o arquivo
        }
        if(conteudo.contains("ERRO")){
            return "";
        }else return conteudo;
    }
    
    public static boolean escreverVendas(Vendas v){}*/
 }
    
    
}
