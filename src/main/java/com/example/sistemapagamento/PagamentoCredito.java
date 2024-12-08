package com.example.sistemapagamento;

public class PagamentoCredito extends Pagamento {
    private static final double TAXA = 0.02;

    public PagamentoCredito(double valor) {
        super(valor + (valor * TAXA));
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento no crédito com taxa de 2% realizado: R$ " + valor);
    }
}