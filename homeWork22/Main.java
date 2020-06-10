package yarchuk;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Лобанов Венедикт Богданович", 6, 2017);
        Group group = new Group(2, "АИ-182");
        try {
            System.out.println(studentService.getAllStudents() + "\n***************************************************************");
            System.out.println(studentService.getStudentsByGroup(group) + "\n***************************************************************");
            System.out.println(studentService.getStudentsByEntranceYear(2019) + "\n***************************************************************");
            System.out.println(studentService.getStudentInfo(student) + "\n***************************************************************");
            System.out.println(studentService.getStudentAverageMark(student));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
