package Interface;

import java.util.Scanner;
import Entities.Calculos;

import javax.swing.JOptionPane;

public class Ui extends Interface {
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

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Integer receberOpcao() {
        return Integer
                .parseInt(JOptionPane.showInputDialog(null, menu(), "Calculadora", -1));
    }

    public Double receberNumero(Calculos calculos) {
        if (calculos.getN1() == null) {
            System.out.println(opcao);
            if (opcao == 5) {
                return Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite a base", "Calculadora", -1));
            } else if (opcao == 6) {
                return Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite o numero que deseja saber a raiz quadrada", "Calculadora", -1));
            }
            return Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero", "Calculadora", -1));

        } else {
            if (opcao == 5) {
                return Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite o expoente", "Calculadora", -1));

            }
            return Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero", "Calculadora", -1));

        }

    }

    public void exibirResultado(Calculos calculos) {
        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "O resultado da soma deu: " + calculos.somar(), "Calculadora", -1);
        } else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, "O resultado da subtracao deu: " + calculos.subtrair(), "Calculadora",
                    -1);

        } else if (opcao == 3) {
            JOptionPane.showMessageDialog(null, "O resultado da multiplicacao deu: " + calculos.multiplicar(),
                    "Calculadora", -1);
        } else if (opcao == 4) {
            JOptionPane.showMessageDialog(null, "O resultado da divisao deu: " + calculos.dividir(), "Calculadora", -1);
        } else if (opcao == 5) {
            JOptionPane.showMessageDialog(null, "O resultado da potencia deu: " + calculos.potencia(), "Calculadora", -1);
        }
        else if (opcao == 6) {
            JOptionPane.showMessageDialog(null, String.format("A raiz quadrada de %.1f é %.2f", calculos.getN1(), calculos.raizQuadrada()), "Calculadora", -1);
        }
    }
}
