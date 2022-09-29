public class TestStudents {
    public static void main(String[] args) {

        Course spanish = new Course("Spanish");
        Course biology = new Course("Biology");

        Student marcus = new Student("Marcus");
        Student oliver = new Student("Oliver");

        marcus.addCourse(spanish);
        oliver.addCourse(biology);
        oliver.addCourse(spanish);

        System.out.println(marcus);
        System.out.println(oliver);

        System.out.println(marcus.coursesToString());
        System.out.println(oliver.coursesToString());
    }
}