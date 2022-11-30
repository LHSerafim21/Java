package sistema_imobiliaria;

import java.time.LocalDate;

public class Comercial extends Imovel {
    protected float taxaImpostoFederal;

    public Comercial(int codigoImovel, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem, float areaTotal, float valorIPTU, float valorVenda, float valorAluguel, float areaConstruida, String endereco, LocalDate dataConstrucao, float taxaImpostoFederal, boolean alugado) {
        super(codigoImovel, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem, areaTotal, valorIPTU, valorVenda, valorAluguel, areaConstruida, endereco, dataConstrucao, alugado);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }
    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    @Override
    public float getValorAluguel(){
        return valorAluguel + (valorAluguel+(taxaImpostoFederal/100));
    }

    @Override
    public String toString(){
        return super.toString()+"\nValor do Aluguel: R$ "+valorAluguel;
    }
    
}
