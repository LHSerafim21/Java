package sistema_imobiliaria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Aluguel {
    private int codigoAluguel;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataAluguel, dataDevolucao, dataPagamentoMensal;
    private float valorTotalAluguel;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private boolean pago;
    private boolean disponivel=true;
    
    public Aluguel(int codigoAluguel, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataAluguel, LocalDate dataDevolucao, LocalDate dataPagamentoMensal, float valorTotalAluguel, Pagamento formaPagamento, ArrayList<Seguro> segurosContratados, boolean pago, boolean disponivel) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.valorTotalAluguel = valorTotalAluguel;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.pago = pago;
        this.disponivel = disponivel;
    }

    public int getCodigoAluguel() {
        return codigoAluguel;
    }
    public void setCodigoAluguel(int codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
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
    public LocalDate getDataAluguel() {
        return dataAluguel;
    }
    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public LocalDate getDataPagamentoMensal() {
        return dataPagamentoMensal;
    }
    public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
        this.dataPagamentoMensal = dataPagamentoMensal;
    }
    public float getValorTotalAluguel() {
        return valorTotalAluguel;
    }
    public void setValorTotalAluguel(float valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }
    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }
    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////

    public float calcularValorTotal(float ValorAluguel) {    
        long meses = dataAluguel.until(dataDevolucao, ChronoUnit.MONTHS);
        return valorTotalAluguel = imovel.getValorAluguel() * meses;
    }
    
    public boolean possuiSeguro(int codigoSeguro){
        for(Seguro seguro : this.segurosContratados){
            if(seguro.getCodigoSeguro() == codigoSeguro){
                return true;
            }
        }
        return false;
    }

    public boolean verificarAtraso(){
   
        LocalDate hoje = LocalDate.now();

        if(getDataPagamentoMensal().isAfter(hoje) == true){
            return true;                                             //se estiver atrasado
        }
        return false;                                                //nao esta atrasado
    }

    public boolean verificarDisponivel(){
        if(disponivel == true){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Codigo do Aluguel: "+codigoAluguel+
                "\nCliente: "+cliente.getNome()+
                "\nCorretor: "+corretor.getNome()+
                "\nImovel: "+imovel.getCodigoImovel()+
                "\nData do Aluguel: "+dataAluguel+
                "\nData da Devolucao: "+dataDevolucao+
                "\nData do pagamento (MENSAL): "+dataPagamentoMensal+
                "\nValor total do aluguel: "+valorTotalAluguel+
                "\nForma de Pagamento: "+formaPagamento.getTipoPagamento()+
                "\nPossui Seguro: "+segurosContratados+
                "\nPago: "+pago+
                "\nDisponivel: "+verificarDisponivel();
    }
   
    
    
}
