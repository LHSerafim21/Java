package sistema_imobiliaria;

public class Dinheiro extends Pagamento {

    public Dinheiro(String tipoPagamento) {
        super(tipoPagamento);
    }

    @Override
    public String toString() {
        return "Tipo de Pagamento: "+tipoPagamento;
    }
    
}
