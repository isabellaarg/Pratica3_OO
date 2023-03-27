package br.com.folhadepagamento;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int escolha, matricula, producao;
        String nome;
        double salario, percentual,vendas, valor;

        do {

            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de funcionario:\n1. Padrão\n2. Produtividade\n3. Comissionado"));

            switch (escolha) {
                case 1:
                    matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingresse a matricula do funcionario: "));
                    nome = JOptionPane.showInputDialog("Ingresse o nome do funcionario:");
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o salario do funcionario: "));

                    FPadrao fpadrao = new FPadrao(matricula, nome, salario);

                    JOptionPane.showMessageDialog(null, "" + fpadrao.toString(), "Folha de pagamento", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingresse a matricula do funcionario: "));
                    nome = JOptionPane.showInputDialog("Ingresse o nome do funcionario:");
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o salario do funcionario: "));
                    percentual = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o percentual de comissão: "));
                    vendas = Double.parseDouble(JOptionPane.showInputDialog("Ingresse as vendas total feitas: "));


                    FComissionado fComissionado = new FComissionado(matricula, nome, salario, percentual, vendas);

                    JOptionPane.showMessageDialog(null, "" + fComissionado.toString() + "\nSalario: " + fComissionado.calcularProventos(), "Folha de pagamento", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingresse a matricula do funcionario: "));
                    nome = JOptionPane.showInputDialog("Ingresse o nome do funcionario:");
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o salario do funcionario: "));
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresse o valor por unidade produzida: "));
                    producao = Integer.parseInt(JOptionPane.showInputDialog("Ingresse as unidades produzidas: "));

                    FProdutividade fProdutividade = new FProdutividade(matricula, nome, salario, valor, producao);

                    JOptionPane.showMessageDialog(null, "" + fProdutividade.toString() + "\nSalario: " + fProdutividade.calcularProventos(), "Folha de pagemento", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha invalida", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        } while (escolha !=3);
    }
}
