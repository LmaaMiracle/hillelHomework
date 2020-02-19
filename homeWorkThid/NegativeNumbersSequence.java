package yarchuk;

public class NegativeNumbersSequence {

    public void sequenceWithStep() {
        int i = 0;
        int counter = 0;

        while (counter != 10) {
            System.out.println(i);
            i -= 5;
            counter++;
        }
    }

}
