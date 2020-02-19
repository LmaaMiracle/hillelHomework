package yarchuk;

public class Main {

    public static void main(String[] args) {
        ForStatementsTask forStatementsTask = new ForStatementsTask();
        // forStatementsTask.oddNumbers();
        // System.out.println(forStatementsTask.factorial(5));

        WhileStatementTask whileStatementTask = new WhileStatementTask();
        // whileStatementTask.oddNumbers();
        // System.out.println(whileStatementTask.factorial(5));

        DoWhileStatementTask doWhileStatementTask = new DoWhileStatementTask();
        // doWhileStatementTask.oddNumbers();
        // System.out.println(doWhileStatementTask.factorial(5));

        Exponentiation expon = new Exponentiation();
        // System.out.println(expon.exponentiation(2, 3));
        // System.out.println(expon.exponentiationThroughLoop(2, 3));

        NegativeNumbersSequence negativeNumbersSequence = new NegativeNumbersSequence();
        //negativeNumbersSequence.sequenceWithStep();

        MultiplicationTable multipl = new MultiplicationTable();
        //multipl.multiplicationTable();

        firstTenOddNums firstTenOddNums = new firstTenOddNums();
        // firstTenOddNums.oddNumsToOneLane();

        double[] array = new double[]{2.5, 3, 6, 7.2, 1};
        AverageValueOfArray averageValueOfArray = new AverageValueOfArray();
        // System.out.println(averageValueOfArray.averageValue(array));

        SwapArrayMaxMinValues swapArrayMaxMinValues = new SwapArrayMaxMinValues();
        // System.out.println(Arrays.toString(swapArrayMaxMinValues.swapMaxMin(array)));

        int[] arr = new int[]{2, 3, 6, 7, 1};
        MaxValue maxValue = new MaxValue();
        // System.out.println(maxValue.getMaxValue(arr));

        MinValue minValue = new MinValue();
        // System.out.println(minValue.getMinValue(arr));

        ChessTable chess = new ChessTable();
        //chess.chessTable();
    }
}
