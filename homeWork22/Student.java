package yarchuk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private int id;
    private String fullName;
    private int groupId;
    private int entranceYear;

    @Override
    public String toString() {
        return "id: " + id +
                "\nfull name: " + fullName +
                "\ngroup id: " + groupId +
                "\nentrance year: " + entranceYear + "\n\n";
    }
}
