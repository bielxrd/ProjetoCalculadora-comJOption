package Interface;

import Entities.Calculos;

public class Interface {
    protected int opcao;

    public void exibirInterface() {
        Ui interacao = new Ui();

        do {
            Calculos calculos = new Calculos(null, null);
            opcao = interacao.receberOpcao();
            interacao.setOpcao(opcao);
            if (opcao == 1) {
                calculos.setN1(interacao.receberNumero(calculos));
                calculos.setN2(interacao.receberNumero(calculos));

                interacao.exibirResultado(calculos);

            } else if (opcao == 2) {
                calculos.setN1(interacao.receberNumero(calculos));
                calculos.setN2(interacao.receberNumero(calculos));

                interacao.exibirResultado(calculos);

            } else if (opcao == 3) {
                calculos.setN1(interacao.receberNumero(calculos));
                calculos.setN2(interacao.receberNumero(calculos));

                interacao.exibirResultado(calculos);

            } else if (opcao == 4) {
                calculos.setN1(interacao.receberNumero(calculos));
                calculos.setN2(interacao.receberNumero(calculos));

                interacao.exibirResultado(calculos);

            } else if (opcao == 5) {
                calculos.setN1(interacao.receberNumero(calculos));
                calculos.setN2(interacao.receberNumero(calculos));

                interacao.exibirResultado(calculos);

            } else if (opcao == 6) {
                calculos.setN1(interacao.receberNumero(calculos));
                interacao.exibirResultado(calculos);
            }

        } while (opcao != 0);
    }

}
