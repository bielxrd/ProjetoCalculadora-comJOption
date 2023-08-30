package Entities;

public class Calculos extends Calculator {

    public Calculos(Double n1, Double n2) {
        super(n1, n2);
    }

    public Double somar() {
        setResult(getN1() + getN2());
        return getResult();

    }

}
