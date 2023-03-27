package br.com.carnaval;

public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valorReais, double valorAdicional) {
        super(valorReais);
        this.valorAdicional = valorAdicional;
    }
    public void calcularIngressoVip(){
        double valorTotal = getValorReais() + valorAdicional;
        setValorReais(valorTotal);
    }

    public String ingressoVip(){
        return "Valor ingresso VIP: " + getValorReais();
    }
}
