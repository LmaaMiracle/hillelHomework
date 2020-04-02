package yarchuk;

import java.util.List;
import java.util.OptionalDouble;

public class AverageValueOfList {

    public double getAverageValueOfList(List<Integer> list) {
        double averageValue;

        return averageValue = list.stream().mapToInt(count -> count).average().orElse(0.0);
    }

}
