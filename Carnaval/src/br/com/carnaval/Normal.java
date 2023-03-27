package br.com.carnaval;

public class Normal extends Ingresso {
    public Normal(double valorReais) {
        super(valorReais);
    }
    public void valorVip(double adicionalVip){
        double valorTotal = getValorReais() + adicionalVip;
        setValorReais(valorTotal);
    }
    public String mostrarIngressoNormal(){
        return "Ingresso Total normal" + getValorReais();
    }
}
