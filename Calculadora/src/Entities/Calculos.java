package Entities;

public class Calculos extends Calculator {

    public Calculos(Double n1, Double n2) {
        super(n1, n2);
    }

    public Double somar() {
        setResult(getN1() + getN2());
        return getResult();

    }
    public Double subtrair() {
        setResult(getN1() - getN2());
        return getResult();
    }
    public Double multiplicar() {
        setResult(getN1() * getN2());
        return getResult();

    }
    public Double dividir() {
        setResult(getN1() / getN2());
        return getResult();

    }
    public Double potencia() {
        setResult(Math.pow(getN1(), getN2()));
        return getResult();
    }
    public Double raizQuadrada() {
        setResult(Math.sqrt(getN1()));
        return getResult();
    }

}
