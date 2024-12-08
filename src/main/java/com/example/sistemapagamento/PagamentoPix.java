package com.example.sistemapagamento;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento via PIX realizado no valor de: R$ " + valor);
    }

    // Sobrecarga
    public void realizarPagamento(String descricao) {
        System.out.println("Pagamento via PIX de R$ " + valor + " - Descrição: " + descricao);
    }
}