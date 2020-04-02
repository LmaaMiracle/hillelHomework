package yarchuk;

import java.util.List;
import java.util.stream.Collectors;

public class LowercaseString {

    public List<String> filetListOfString(List<String> list) {
        return list.stream().filter(s -> s.length() == 4 && s.equals(s.toLowerCase())).collect(Collectors.toList());
    }

}
