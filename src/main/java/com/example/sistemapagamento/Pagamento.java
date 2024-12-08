package com.example.sistemapagamento;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento realizado no valor de: R$ " + valor);
    }
}

