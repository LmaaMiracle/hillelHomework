package yarchuk;

public class WhileStatementTask {

    public void oddNumbers() {
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int factorial(int n) {
        int factorial = 1;
        int i = 1;
        while(i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
