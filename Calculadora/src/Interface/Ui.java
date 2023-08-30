package Interface;

import java.util.Scanner;

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
}
