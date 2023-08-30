package Interface;

import java.util.Scanner;
import Entities.Calculos;

import javax.swing.JOptionPane;

public class Ui {
    static Scanner ler = new Scanner(System.in);

    public String menu() {
        return "Escolha uma opcao\n" +
                "1. Somar\n" +
                "2. Subtrair\n" +
                "3. Multiplicar\n" +
                "4. Divisao\n" +
                "5. Potencia\n" +
                "6. Raiz Quadrada\n" +
                "0. Sair";

    }
    public Integer receberOpcao() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, menu(), "Calculadora", -1));
    }

    public Double receberNumero(Calculos calculos) {
        if (calculos.getN1() == null) {
            return Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero", "Calculadora", -1));

        }
        else {
            return Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero", "Calculadora", -1));

        }

    }
}
