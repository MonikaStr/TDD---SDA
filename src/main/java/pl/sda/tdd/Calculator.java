package pl.sda.tdd;

public class Calculator {

    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int subtract(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public double divide(double arg1, double arg2) {
        if (arg2 == 0) {
            throw new IllegalArgumentException("Nie dzieli się przez 0");
        } else {
            return arg1 / arg2;
        }
    }

/*
Rozszerz klasę Calculator tak, żeby przyjmowała wartości typu Integer
zamiast int. Jeśli któryś z argumentów = null -> rzucamy wyjątek z
odpowiednią wiadomością. Jeśli dzielnik = null -> rzucamy wyjątek z
odpowiednią wartością.
 */
    public Integer add2(Integer arg1, Integer arg2) {
        if (arg1 == null || arg2 == null) {
            throw new NullPointerException("Parametr jest nullem");
        }
        return arg1 + arg2;
    }

}
