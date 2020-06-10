package yarchuk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Marks {
    private int id;
    private int lessonId;
    private int studentId;
    private int mark;

    @Override
    public String toString() {
        return "\n" + studentId + " " + mark + " " + lessonId + " " + id;
    }
}


