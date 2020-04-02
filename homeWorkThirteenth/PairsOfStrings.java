package yarchuk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PairsOfStrings {

    public Map<String, String> getPairOfString(List<String> list) {

        Map<String, String> map = new LinkedHashMap<>();

        list.stream().forEach(s -> map.put(s, s.toUpperCase()));

        return map;
    }

}
