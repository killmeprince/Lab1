public class Student {
    private String name;
    private String group;
    private int course;
    private int averageMark;

    public Student(String name, String group, int course, int averageMark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void incrementCourse() {
        if (course < 5) { // Предположим, что максимальный курс — 5
            this.course++;
        }
    }
}
