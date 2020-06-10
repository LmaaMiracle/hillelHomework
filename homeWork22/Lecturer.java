package yarchuk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Lecturer {
    private int id;
    private String fullName;
    private int departmentId;
}
