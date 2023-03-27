package br.com.veiculo;

import javax.swing.*;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Dados do veículo:\n\nPlaca: " +getPlaca() + "\nAno: " + getAno(), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Número de eixos: " + getEixos(), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}
