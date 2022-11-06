import java.time.LocalDate;

public class CasaResidencial extends Imovel {

    public CasaResidencial(int codigoImovel, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem,
            float areaTotal, float valorIPTU, float valorVenda, float valorAluguel, float areaConstruida,
            String endereco, LocalDate dataConstrucao) {
        super(codigoImovel, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem, areaTotal, valorIPTU, valorVenda,
                valorAluguel, areaConstruida, endereco, dataConstrucao);
    }

    public CasaResidencial() {
    }

    @Override
    public String toString(){
        return super.toString();
    }
        
}
