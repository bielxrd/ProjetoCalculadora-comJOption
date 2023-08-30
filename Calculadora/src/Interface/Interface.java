package Interface;

import javax.swing.JOptionPane;

import Entities.Calculos;

public class Interface {

    public void exibirInterface() {
        Ui interacao = new Ui();
        int opcao = 0;
        Calculos calculos = new Calculos(null, null);

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, interacao.menu(), "Calculadora", -1));

            if (opcao == 1) {
                calculos.setN1(Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero", "Calculadora", -1)));
                calculos.setN2(Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero", "Calculadora", -1)));

                JOptionPane.showMessageDialog(null, "O resultado da soma deu = " + calculos.somar(), "Calculadora", -1);

            } else if (opcao == 2) {
                calculos.setN1(interacao.receberNumero(calculos));
                calculos.setN2(interacao.receberNumero(calculos));
                
            }

        } while (opcao != 0);
    }

}
