package Modelo;

/**
 *
 * @author Henrique
 * @author Nazaro
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Venda {

    private int codigo;
    private Cliente cliente;
    private Gerente gerente;
    private LocalDate dataVenda;
    private LocalDate dataDaEntrega;
    private ArrayList<ItemVenda> itensVenda;
    private float valorTotal;
    private float valorComDesconto;
    private Pagamento formaPagamento;
    private Transportadora transportadora;

    public Venda(int codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, LocalDate dataDaEntrega,
            ArrayList<ItemVenda> itensVenda, float valorTotal, float valorComDesconto, Pagamento formaPagamento,
            Transportadora transportadora) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.gerente = gerente;
        this.dataVenda = dataVenda;
        this.dataDaEntrega = dataDaEntrega;
        this.itensVenda = itensVenda;
        this.valorTotal = valorTotal;
        this.valorComDesconto = valorComDesconto;
        this.formaPagamento = formaPagamento;
        this.transportadora = transportadora;
    }

    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) { this.cliente = cliente;}
    public Gerente getGerente() {return gerente;}
    public void setGerente(Gerente gerente) { this.gerente = gerente;}
    public LocalDate getDataVenda() {return dataVenda;}
    public void setDataVenda(LocalDate dataVenda) {this.dataVenda = dataVenda;}
    public LocalDate getDataDaEntrega() {return dataDaEntrega;}
    public void setDataDaEntrega(LocalDate dataDaEntrega) {this.dataDaEntrega = dataDaEntrega;}
    public ArrayList<ItemVenda> getItensVenda() {return itensVenda;}
    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {this.itensVenda = itensVenda;}
    public float getValorTotal() {return valorTotal;}
    public void setValorTotal(float valorTotal) {this.valorTotal = valorTotal;}
    public float getValorComDesconto() {return valorComDesconto;}
    public void setValorComDesconto(float valorComDesconto) {this.valorComDesconto = valorComDesconto;}
    public Pagamento getFormaPagamento() {return formaPagamento;}
    public void setFormaPagamento(Pagamento formaPagamento) {this.formaPagamento = formaPagamento;}
    public Transportadora getTransportadora() {return transportadora;}
    public void setTransportadora(Transportadora transportadora) {this.transportadora = transportadora;}

    ///////////////////////////////////////////////////////

    public float calcularValorTotal() {
        Iterator<ItemVenda> iterator = itensVenda.iterator();
        float valor=0;
        while (iterator.hasNext()) {
            if(cliente.getOuro() == true){
               valor = valor + iterator.next().calcularTotalOuro();
            } else {
               valor = valor + iterator.next().calcularTotal();
            }
        } return valor;
    }

    public LocalDate calcularDataEntrega() {
        return dataVenda.plusDays(transportadora.getTempoDeEntrega());
    }

    public int addItemVenda(ItemVenda item) {
        if (itensVenda.add(item)) {
            return 1;// Deu certo (Interface)
        } else
            return -1;// Deu errado (Interface)
    }

}
