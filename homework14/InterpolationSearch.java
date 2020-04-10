package yarchuk;

public class InterpolationSearch {

    public int interpolationSearch(int[] sortedArray, int element) {
        int lowIndex = 0;
        int highIndex = sortedArray.length - 1;


        while (sortedArray[highIndex] != sortedArray[lowIndex]
                && element >= sortedArray[lowIndex]
                && element <= sortedArray[highIndex]) {

            if(sortedArray[highIndex] - sortedArray[lowIndex] == 0) {
                return (lowIndex + highIndex) / 2;
            }

            int middle = lowIndex + ((element - sortedArray[lowIndex]) * (highIndex - lowIndex)) /
                    (sortedArray[highIndex] - sortedArray[lowIndex]);

            if (element < sortedArray[middle]) {
                highIndex = middle - 1;
            } else if (element > sortedArray[middle]) {
                lowIndex = middle + 1;
            } else {
                return middle;
            }
        }

        if (element == sortedArray[lowIndex]) {
            return lowIndex;
        }

        return -1;
    }

}
