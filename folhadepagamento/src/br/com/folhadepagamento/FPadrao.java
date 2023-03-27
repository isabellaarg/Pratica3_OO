package br.com.folhadepagamento;

public class FPadrao extends Funcionario{
    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public String toString(){
        return "Funcionario: "+ getNome()+ "\nMatricula: " + getMatricula() + "\nSalario: " + getSalario();
    }
}
