package yarchuk;

public class BinarySearch {

    public int binarySearch(double[] sortedArray, double element) {

        return recursion(sortedArray, element, 0, sortedArray.length - 1);

    }

    private int recursion(double[] sortedArray, double element, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) {
            return -1;
        }

        int elementPosition = -1;

        int middleIndex = (lowIndex + highIndex) / 2;

        if (element == sortedArray[middleIndex]) {
            elementPosition = middleIndex;
        } else if (element < sortedArray[middleIndex]) {
            return recursion(sortedArray, element, lowIndex, middleIndex - 1);
        } else if (element > sortedArray[middleIndex]) {
            return recursion(sortedArray, element, middleIndex + 1, highIndex);
        }

        return elementPosition;
    }

}
