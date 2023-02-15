package model;

import java.time.LocalDate;

public class Contrato {

    private int numero;
    private LocalDate data;
    private double valorTotal;

    public Contrato() {
    }

    public Contrato(int numero, LocalDate data, double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void geradorParcelas(int numeroDeParcelas) {
        for (int i = 1; i <= numeroDeParcelas; i ++) {
            double parcela = valorTotal/numeroDeParcelas;
            double valor = parcela + jurosSimples(parcela, 0.01, i) + calculaTaxa(parcela);
            parcela = valor;
            System.out.println(data.plusMonths(i) + " valor " + valor);
        }
    }

    public double jurosSimples(double valor, double taxa, int tempo) {
        return valor * taxa * tempo;
    }

    public double calculaTaxa(double valor) {
        return valor * 0.02;
    }
}
