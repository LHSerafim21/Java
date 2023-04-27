package aula07;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Caixa caixa = new Caixa(1000);

        for (int i = 0; i < 5; i++) {
            Cliente cliente1 = new Cliente(caixa);
            Cliente cliente2 = new Cliente(caixa);
            Cliente cliente3 = new Cliente(caixa);
            Cliente cliente4 = new Cliente(caixa);
            Cliente cliente5 = new Cliente(caixa);
            cliente1.start();
            cliente2.start();
            cliente3.start();
            cliente4.start();
            cliente5.start();
        }

        // Aguarda a conclusão das operações de todos os clientes
        Thread.sleep(5000);

        System.out.println("Valor em caixa: R$ " + String.format("%.2f", caixa.getValorEmCaixa()));
        System.out.println("Total de depósitos: R$ " + String.format("%.2f", caixa.getTotalDeposito()));
        System.out.println("Total de saques: R$ " + String.format("%.2f", caixa.getTotalSaque()));
    }
}
