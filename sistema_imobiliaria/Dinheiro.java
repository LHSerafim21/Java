public class Dinheiro extends Pagamento {

    public Dinheiro() {
    }
    public Dinheiro(String tipoPagamento) {
        super(tipoPagamento);
    }

    @Override
    public String toString() {
        return "Tipo de Pagamento: "+tipoPagamento;
    }
    
}
