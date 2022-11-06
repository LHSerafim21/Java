package sistema_imobiliaria;

public class Configuracao {

    private String arquivoAlugueis, arquivoVendas, arquivoImoveis, arquivoClientes, arquivoCorretores, arquivoSeguros;
    
    Configuracao(String arquivoAlugueis, String arquivoVendas, String arquivoImoveis, String arquivoClientes, String arquivoCorretores, String arquivoSeguros){
        this.arquivoAlugueis = arquivoAlugueis;
        this.arquivoVendas = arquivoVendas;
        this.arquivoImoveis = arquivoImoveis;
        this.arquivoClientes = arquivoClientes;
        this.arquivoCorretores = arquivoCorretores;
        this.arquivoSeguros = arquivoSeguros;
    }

    public String getArquivoAlugueis(){
        return arquivoAlugueis;
    }

    public void setArquivoAlugueis(String arquivoAlugueis){
        this.arquivoAlugueis = arquivoAlugueis;
    }
    
    public String getArquivoVendas(){
        return arquivoVendas;
    }

    public void setArquivoVendas(String arquivoVendas){
        this.arquivoVendas = arquivoVendas;
    }

    public String getArquivoImoveis(){
        return arquivoImoveis;
    }

    public void setArquivoImoveis(String arquivoImoveis){
        this.arquivoImoveis = arquivoImoveis;
    }

    public String getArquivoClientes(){
        return arquivoClientes;
    }

    public void setArquivoClientes(String arquivoClientes){
        this.arquivoClientes = arquivoClientes;
    }

    public String getArquivoCorretores(){
        return arquivoCorretores;
    }

    public void setArquivoCorretores(String arquivoCorretores){
        this.arquivoCorretores = arquivoCorretores;
    }

    public String getArquivoSeguros(){
        return arquivoSeguros;
    }

    public void setArquivoSeguros(String arquivoSeguros){
        this.arquivoSeguros = arquivoSeguros;
    }

    
    //TODO - Adicionar demais config necessarias e metodos + contrutores + getters and setters
}
