package com.example.sistemapagamento;

public class PagamentoDebito extends Pagamento {
    private static final double TAXA = 0.01;

    public PagamentoDebito(double valor) {
        super(valor + (valor * TAXA));
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento no débito com taxa de 1% realizado: R$ " + valor);
    }
}