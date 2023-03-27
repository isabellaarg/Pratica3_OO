package br.com.carnaval;

public class Camarote extends Ingresso{
    private double valorAdicional;
    private String localizacaoCamarote;

    public Camarote(double valorReais, double valorAdicional, String localizacaoCamarote) {
        super(valorReais);
        this.valorAdicional = valorAdicional;
        this.localizacaoCamarote = localizacaoCamarote;
    }

    public String getLocalizacaoCamarote() {
        return localizacaoCamarote;
    }

    public void setLocalizacaoCamarote(String localizacaoCamarote) {
        this.localizacaoCamarote = localizacaoCamarote;
    }
    public void calcularIngressoCamarote(){
        double valorTotal = getValorReais() + valorAdicional;
        setValorReais(valorTotal);
    }

    public String ingressoCamarote(){
        return "Ingresso Total camarote: " + getValorReais() + "\nLocalização: " + getLocalizacaoCamarote();
    }

}
