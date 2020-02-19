package yarchuk;

public class ForStatementsTask {

    public void oddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
