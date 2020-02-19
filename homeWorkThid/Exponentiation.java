package yarchuk;

public class Exponentiation {

    public double exponentiation(double x, double n) {
        return Math.pow(x, n);
    }

    //может вы хотели, чтобы мы его сделали через цикл
    public double exponentiationThroughLoop(double x, double n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

}
