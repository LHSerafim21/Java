import java.time.LocalDate;

public class ApartamentoResidencial extends Imovel{
    protected int andar;
    protected float valorCondominio;
    
    public ApartamentoResidencial() {
    }
    public ApartamentoResidencial(int codigoImovel, int qtdDormitorios, int qtdBanheiros, int qtdsVagasGaragem,
            float areaTotal, float valorIPTU, float valorVenda, float valorAluguel, float areaConstruida,
            String endereco, LocalDate dataConstrucao, int andar, float valorCondominio) {
        super(codigoImovel, qtdDormitorios, qtdBanheiros, qtdsVagasGaragem, areaTotal, valorIPTU, valorVenda,
                valorAluguel, areaConstruida, endereco, dataConstrucao);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }
    
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public float getValorCondominio() {
        return valorCondominio;
    }
    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    @Override
    public float getValorAluguel(){
        return valorAluguel+valorCondominio;
    }

    @Override
    public String toString(){
        return super.toString()+andar+"° andar /n Valor Aluguel: R$ "+getValorAluguel();
    }
        
}
