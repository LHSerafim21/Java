package aula07;

public class Caixa extends Thread {
    private double valorEmCaixa;
    private double totalDeposito;
    private double totalSaque;
    private final Object lock = new Object(); // lock para sincronização

    public Caixa(double valorInicial) {
        this.valorEmCaixa = valorInicial;
        this.totalDeposito = 0;
        this.totalSaque = 0;
    }

    public void depositar(double valor) {
        synchronized (lock) {
            this.valorEmCaixa += valor;
            this.totalDeposito += valor;
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        synchronized (lock) {
            if (valor > this.valorEmCaixa) {
                throw new SaldoInsuficienteException();
            }
            this.valorEmCaixa -= valor;
            this.totalSaque += valor;
        }
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public double getTotalDeposito() {
        return totalDeposito;
    }

    public double getTotalSaque() {
        return totalSaque;
    }
}
