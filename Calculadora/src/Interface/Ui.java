package Interface;

import java.util.Scanner;

public class Ui {
    static Scanner ler = new Scanner(System.in);
    public int menu() {
        System.out.println("Escolha uma opcao");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Divisao");
        return ler.nextInt();

    }
}
