package yarchuk;

public class DoWhileStatementTask {

    public void oddNumbers() {
        int i = 0;

        do {
            if (i % 2 == 1)
                System.out.println(i);
            i++;
        } while (i < 100);
    }

    public int factorial(int n) {
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= n);
        return factorial;
    }
}
