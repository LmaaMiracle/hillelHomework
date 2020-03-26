package yarchuk;

public class QuadraticEquationRoots {

    //Работает только тогда, когда у нас корни на выходе получаются
    //целыми, так как итерация по цыклу всегда идёт + 1
    //Просто было интересно реализовать через Виета. Так или иначе, для целых корней -- работает отлично
    //Пример входных параметров: 8 и 15, -3 и 2, -3 и -18, -5 + 6

    public void calculateRootsWithVieta(double b, double c) {
        double firstRoot = 0;
        double secondRoot = 0;

        double greaterNumber = getAbsMaxValue(b, c);

        for (double i = greaterNumber * (-1); i < greaterNumber; i++) {
            for (double j = i; j < greaterNumber; j++) {
                if (i + j == ((-1) * b) && i * j == c) {
                    firstRoot = i;
                    secondRoot = j;
                }
            }
        }
        System.out.println("The roots are: [" + firstRoot + ", " + secondRoot + "]");
    }

    private double getAbsMaxValue(double b, double c) {
        b = Math.abs(b);
        c = Math.abs(c);

        return Math.max(b, c);
    }

    //Это по канону работает для всего
    //Примеры для теста:
    //Нет корней: [3, -4, 2]
    //Два корня: [1, -4, -5]
    //Корень один: [1, -6, 9]
    public void calculateRootsWithDiscriminant(double a, double b, double c) {
        double firstRoot;
        double secondRoot;
        double discriminant;

        discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println(discriminant);

        firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
        secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant > 0) {
            System.out.println(discriminant);
            System.out.println("The roots are: [" + firstRoot + ", " + secondRoot + "]");
        } else if (discriminant == 0) {
            System.out.println("The root is " + firstRoot);
        } else if (discriminant < 0) {
            System.out.println("Equation has no roots!");
        }
    }

}
