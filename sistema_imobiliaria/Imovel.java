import java.time.LocalDate;

public abstract class Imovel {
    protected int codigoImovel, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem;
    protected float areaTotal, valorIPTU, valorVenda, valorAluguel, areaConstruida;
    protected String endereco;
    protected LocalDate dataConstrucao;
    
    public Imovel(int codigoImovel, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem, float areaTotal,
            float valorIPTU, float valorVenda, float valorAluguel, float areaConstruida, String endereco,
            LocalDate dataConstrucao) {
        this.codigoImovel = codigoImovel;
        this.qtdDormitorios = qtdDormitorios;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdsVagasGaragem = qtdsVagasGaragem;
        this.areaTotal = areaTotal;
        this.valorIPTU = valorIPTU;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        this.areaConstruida = areaConstruida;
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
    }

    public Imovel() {
    }
    
    public int getCodigoImovel() {
        return codigoImovel;
    }
    public void setCodigoImovel(int codigoImovel) {
        this.codigoImovel = codigoImovel;
    }
    public int getQtdDormitorios() {
        return qtdDormitorios;
    }
    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }
    public int getQtdBanheiros() {
        return qtdBanheiros;
    }
    public void setQtdBanheiros(int qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }
    public int getQtdsVagasGaragem() {
        return qtdsVagasGaragem;
    }
    public void setQtdsVagasGaragem(int qtdsVagasGaragem) {
        this.qtdsVagasGaragem = qtdsVagasGaragem;
    }
    public float getAreaTotal() {
        return areaTotal;
    }
    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }
    public float getValorIPTU() {
        return valorIPTU;
    }
    public void setValorIPTU(float valorIPTU) {
        this.valorIPTU = valorIPTU;
    }
    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    public float getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    public float getAreaConstruida() {
        return areaConstruida;
    }
    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }
    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    @Override
    public String toString() {
        return "Codigo: "+codigoImovel+" | Data da Construcao: "+dataConstrucao+"\nEndereço: "+endereco+ 
                "\n Area Total: "+areaTotal+" | Area Construida: "+areaConstruida+"\nQuartos: "+qtdDormitorios+
                " | Banheiros: "+qtdBanheiros+" | Vagas na Garagem: "+qtdsVagasGaragem+"\nValor de Venda: R$ "+valorVenda+
                " | Valor do Aluguel: R$ "+valorAluguel+" | Valor do IPTU: R$ "+valorIPTU;
    }

    
}