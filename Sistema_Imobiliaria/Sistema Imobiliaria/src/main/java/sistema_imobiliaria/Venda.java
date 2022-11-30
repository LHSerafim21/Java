package sistema_imobiliaria;

import java.time.LocalDate;

public class Venda {
    private int codigoVenda;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataVenda;
    private float valorTotalVenda;
    private Pagamento formaPagamento;
    private boolean disponivel=true;

    public Venda(int codigoVenda, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataVenda, float valorTotalVenda, Pagamento formaPagamento, boolean disponivel) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.formaPagamento = formaPagamento;
        this.disponivel = disponivel;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }
    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Corretor getCorretor() {
        return corretor;
    }
    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }
    public Imovel getImovel() {
        return imovel;
    }
    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    public LocalDate getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    public float getValorTotalVenda() {
        return valorTotalVenda;
    }
    public void setValorTotalVenda(float valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }
    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean verificarDisponivel(){
        if(disponivel == true){
            return true;
        }
        else return false;
    }

    @Override
    public String toString(){
        return "Codigo da Venda: "+codigoVenda+
                "\nCliente: "+cliente.getNome()+
                "\nCorretor: "+corretor.getNome()+
                "\nImovel: "+imovel.getCodigoImovel()+
                "\nData da Venda: "+dataVenda+
                "\nValor total da venda: "+valorTotalVenda+
                "\nForma de Pagamento: "+formaPagamento.getTipoPagamento()+
                "\nDisponivel: "+verificarDisponivel();
    }
}
