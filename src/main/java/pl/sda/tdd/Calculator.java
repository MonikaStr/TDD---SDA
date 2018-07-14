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
        }
        else {
            return arg1 / arg2;
        }
    }

}
