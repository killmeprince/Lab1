import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Paul", "ЖУР 3-20-01", 2, 3));
        students.add(new Student("Paul1", "ЖУР 3-21-01", 2, 5));
        students.add(new Student("Paul2", "ЖУР 3-230-01", 2, 2));
        students.add(new Student("Paul3", "ЖУР 3-205-01", 2, 1));
        students.add(new Student("Paul4", "ЖУР 3-201-01", 2, 4));
        students.add(new Student("Paul5", "ЖУР 3-202-01", 2, 4));

        System.out.println("Студенты на 2 курсе:");
        StudentsService.printStudents(students, 2);

        System.out.println("\nПосле очистки и перевода:");
        StudentsService.courseCleaning(students);
        StudentsService.printStudents(students, 3);
    }
}
