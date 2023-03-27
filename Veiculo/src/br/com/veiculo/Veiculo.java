package br.com.veiculo;

import javax.swing.*;

public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Dados do veículo:\n\nPlaca: " +getPlaca() + "\nAno: " + getAno());
    }
}
