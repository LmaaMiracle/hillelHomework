package yarchuk;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Lesson {
    private int id;
    private String lessonName;
    private int lecturerId;
    private int term;
    private int lessonYear;
}
