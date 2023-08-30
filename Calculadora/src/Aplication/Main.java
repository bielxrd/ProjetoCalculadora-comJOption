package Aplication;

import Entities.Calculos;
import Interface.Ui;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Ui interacao = new Ui();

        do {
            opcao = interacao.menu();

            if(opcao == 1) {
                Calculos calculos = new Calculos(5.0, 5.0);
                System.out.println("Resultado da soma: "+calculos.somar());
            }
            
        } while (opcao!=0);
        
    }
}
