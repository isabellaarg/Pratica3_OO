package br.com.carnaval;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao;
        double ingressoNormal, ingressoVip, adicionalVip,ingressoCamarote, adicionalCamarote;
        String localizacaoCamarote;


        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Carnaval:\n1. Ingresso Normal\n2.VIP\n3.Camarote"));

            switch (opcao) {
                case 1:
                    ingressoNormal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso normal: "));
                    Normal normal = new Normal(ingressoNormal);

                    JOptionPane.showMessageDialog(null, "Ingresso", "Valor ingresso normal: " + normal.mostrarIngressoNormal(), JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    ingressoVip = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso Vip: "));
                    adicionalVip = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional do ingresso Vip: "));

                    Vip vip = new Vip(ingressoVip, adicionalVip);
                    vip.calcularIngressoVip();

                    JOptionPane.showMessageDialog(null, "" + vip.ingressoVip(), "Ingresso", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    ingressoCamarote = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ingresso Camarote: "));
                    adicionalCamarote = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional do ingresso Camarote: "));
                    localizacaoCamarote = JOptionPane.showInputDialog("Escreva a localização do camarote: ");

                    Camarote camarote = new Camarote(ingressoCamarote, adicionalCamarote, localizacaoCamarote);

                    camarote.ingressoCamarote();

                    JOptionPane.showMessageDialog(null, "" + camarote.ingressoCamarote(), "Ingresso", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha invalida", "Ingresso", JOptionPane.ERROR_MESSAGE);

            }
        }while(opcao!=3);


    }
}
