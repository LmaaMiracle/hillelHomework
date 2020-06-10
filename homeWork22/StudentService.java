package yarchuk;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private Connection connection;
    private Statement statement;

    private final String URL = "jdbc:postgresql://localhost:5432/University";
    private final String user = "postgres";
    private final String pass = "nk070780tas";

    public List<Student> getAllStudents() throws SQLException {
        connection = DriverManager.getConnection(URL, user, pass);
        statement = connection.createStatement();

        String query = "SELECT * FROM student INNER JOIN student_group ON student.group_id = student_group.id_gr";
        ResultSet resultSet = statement.executeQuery(query);


        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            students.add(mapStudentFromDb(resultSet));
        }

        statement.close();
        connection.close();

        return students;
    }

    public List<Student> getStudentsByGroup(Group group) throws SQLException {
        List<Student> students = getAllStudents();

//        for (Student student : students) {
//            if (!(group == student.getGroupId())) {
//                students.remove(student);
//            }
//        }
        students.removeIf(student -> !(group.getId() == student.getGroupId()));

        return students;
    }

    public List<Student> getStudentsByEntranceYear(int year) throws SQLException {
        List<Student> students = getAllStudents();

        students.removeIf(student -> !(year == student.getEntranceYear()));
        return students;
    }

    public List<Marks> getStudentInfo(Student student) throws SQLException {
        List<Marks> info = new ArrayList<>();
        connection = DriverManager.getConnection(URL, user, pass);
        statement = connection.createStatement();

        String query = "SELECT \n" +
                "       student.id_student      AS Id,\n" +
                "       student.full_name       AS Full_name,\n" +
                "       student_group.group_tag AS group_name,\n" +
                "       lessons.lesson_name     AS lesson,\n" +
                "       lecturer.full_name      AS lecturer,\n" +
                "       marks.*                 AS marks\n" +
                "FROM marks\n" +
                "         LEFT JOIN student ON marks.student_id = student.id_student\n" +
                "         LEFT JOIN student_group ON student_group.id_gr = student.group_id\n" +
                "         LEFT JOIN lessons ON lessons.id_lesson = marks.lesson_id\n" +
                "         LEFT JOIN lecturer ON lessons.lecturer_id = lecturer.id_lecturer\n" +
                "WHERE student.full_name = ?";


        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getFullName());
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            info.add(mapMarksFromDb(resultSet));
        }

        statement.close();
        connection.close();

        return info;
    }

    public Double getStudentAverageMark(Student student) throws SQLException {
        List<Marks> marks = getStudentInfo(student);

        return marks.stream().mapToDouble(Marks::getMark).average().getAsDouble();
    }

    //в гайдах смотрел, есть два вида получения инфы с бд, по кусочкам каждое поле или мэппинг в один объект
    //мне кажется мэпить в один объект удобней, потом можно всё в лист запихнуть
    private Student mapStudentFromDb(ResultSet resultSet) throws SQLException {
        return new Student(
                resultSet.getInt("id_student"),
                resultSet.getString("full_name"),
                resultSet.getInt("group_id"),
                resultSet.getInt("entrance_year"));
    }

    private Marks mapMarksFromDb(ResultSet resultSet) throws SQLException {
        return new Marks(
                resultSet.getInt("id_mark"),
                resultSet.getInt("lesson_id"),
                resultSet.getInt("student_id"),
                resultSet.getInt("mark"));
    }

}
