import java.util.List;

public class StudentsService {
    public static void courseCleaning(List<Student> students) {
        students.removeIf(student -> student.getAverageMark() < 3);
        students.forEach(Student::incrementCourse);
    }

    public static void printStudents(List<Student> students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
