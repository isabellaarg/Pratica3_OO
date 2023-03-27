package br.com.folhadepagamento;

public class FComissionado extends Funcionario {
    private double percentual;
    private double vendas;

    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public double calcularProventos(){
        double totalComissao = this.vendas + ((this.vendas * this.percentual)/100);
        return getSalario() + totalComissao;
    }

    public String toString(){
        return "Funcionario: "+ getNome()+ "\nMatricula: " + getMatricula();
    }

}
