package br.com.veiculo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int escolha, ano, assentos, eixos;
        String placa;

        do{
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de veiculo:\n1. Veiculo\n2. Onibus\n3. Caminhão"));

            switch (escolha) {
                case 1:
                    placa = JOptionPane.showInputDialog("Ingresse a placa do veiculo ");
                    ano = Integer.parseInt(JOptionPane.showInputDialog("Ingresse o ano do veiculo"));

                    Veiculo veiculo = new Veiculo(placa, ano);

                    veiculo.exibirDados();
                    break;
                case 2:
                    placa = JOptionPane.showInputDialog("Ingresse a placa do onibus ");
                    ano = Integer.parseInt(JOptionPane.showInputDialog("Ingresse o ano do onibus"));
                    assentos = Integer.parseInt(JOptionPane.showInputDialog("Ingresse a quantidade de assentos "));

                    Onibus onibus = new Onibus(placa, ano, assentos);
                    onibus.exibirDados();
                    break;

                case 3:
                    placa = JOptionPane.showInputDialog("Ingresse a placa do veiculo ");
                    ano = Integer.parseInt(JOptionPane.showInputDialog("Ingresse o ano do veiculo"));
                    eixos = Integer.parseInt(JOptionPane.showInputDialog("Ingresse a quantidade de eixos "));

                    Caminhao caminhao = new Caminhao(placa, ano, eixos);
                    caminhao.exibirDados();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Escolha invalida");
                    break;
            }
        }while (escolha !=3);
    }
}
