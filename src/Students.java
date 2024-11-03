import java.util.ArrayList;
import java.util.List;

public class Students {

    public static final List<Student> students_list = new ArrayList<>();


    public static List<Student> courseCleaning() {
       /* for (Student student : students_list) {
            if (student.averageMark < 3) {
                students_list.remove(student);
            } else {
                student.course++;
            }
        }
        return students_list; */

        students_list.removeIf(student -> student.averageMark < 3);

        for (Student student: students_list) {
            student.course++;
        }
        return students_list;
    }



    public static List<Student> printStudents(List<Student> students, int course) {
        List<Student> courseMatch = new ArrayList<>();
        for (Student student : students) {
            if (student.course == course) {
                courseMatch.add(student);
                System.out.println(student.name);

            }
        }
        return courseMatch;
    }

}
