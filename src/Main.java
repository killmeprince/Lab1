import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("paul", "ЖУР 3-20-01", 2, 3);
        Students.students_list.add(student);
        Student student1 = new Student("paul1", "ЖУР 3-21-01", 2, 5);
        Students.students_list.add(student1);
        Student student2 = new Student("paul2", "ЖУР 3-230-01", 2, 2);
        Students.students_list.add(student2);
        Student student3 = new Student("paul3", "ЖУР 3-205-01", 2, 1);
        Students.students_list.add(student3);
        Student student4 = new Student("paul4", "ЖУР 3-201-01", 2, 4);
        Students.students_list.add(student4);
        Student student5 = new Student("paul5", "ЖУР 3-202-01", 2, 4);
        Students.students_list.add(student5);

        Students.printStudents(Students.students_list, 2);
        System.out.println();
        Students.courseCleaning();
        Students.printStudents(Students.students_list, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        Students.printStudents(Students.students_list, 3);



    }
}
