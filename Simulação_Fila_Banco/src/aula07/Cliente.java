package aula07;

import java.util.Random;

public class Cliente extends Thread {
    private final Caixa caixa;
    private final Random random = new Random();

    public Cliente(Caixa caixa) {
        this.caixa = caixa;
    }

    @Override
    public void run() {
        try {
            int operacao = random.nextInt(2); // 0 para depósito, 1 para saque
            double valor = random.nextDouble() * 100; // valor aleatório até 100
            int tempo = random.nextInt(5000); // tempo aleatório até 5 segundos

            Thread.sleep(tempo); // espera o tempo aleatório

            if (operacao == 0) {
                caixa.depositar(valor);
                System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado.");
            } else {
                try {
                    caixa.sacar(valor);
                    System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado.");
                } catch (SaldoInsuficienteException e) {
                    System.out.println("Saque de R$ " + String.format("%.2f", valor) + " não realizado: saldo insuficiente.");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
