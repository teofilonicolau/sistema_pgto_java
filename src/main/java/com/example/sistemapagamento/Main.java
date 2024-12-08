package com.example.sistemapagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCredito(100.00);
        Pagamento pagamento2 = new PagamentoDebito(200.00);
        PagamentoPix pagamento3 = new PagamentoPix(150.00);

        // Uso de Polimorfismo
        pagamento1.realizarPagamento();
        pagamento2.realizarPagamento();

        // Uso de Sobrecarga
        pagamento3.realizarPagamento();
        pagamento3.realizarPagamento("Pagamento de conta de luz");
    }
}