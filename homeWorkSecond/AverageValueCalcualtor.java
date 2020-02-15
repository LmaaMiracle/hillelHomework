package yarchuk;

public class AverageValueCalculator {

    public double averageValueOfTwoNumbers(double a, double b) {
        return (a + b) / 2;
    }

    public double averageValue(double[] args) {
        double sum = 0;
        for (Double arg : args) {
            sum += arg;
        }

        return sum / args.length;
    }

}
