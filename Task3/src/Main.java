import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Math");
        passedCourses.add("English");
        passedCourses.add("Biology");

        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Math");
        passedCourses1.add("English");
        passedCourses1.add("Biology");
        passedCourses1.add("java 1.0");

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Math");
        canTeach.add("English");
        canTeach.add("Biology");
        canTeach.add("java 1.0");

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach.add("Biology");

        Student adam = new Student("Adam", passedCourses1);
        Student oliver = new Student("Oliver", passedCourses);
        Student sebastian = new Student("Sebastian", passedCourses);

        Teacher jorg = new Teacher("Jorg", canTeach);
        Teacher tess = new Teacher("Tess", canTeach1);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(adam);
        persons.add(oliver);
        persons.add(sebastian);
        persons.add(jorg);
        persons.add(tess);

        for (Person p : persons) {
            if (!p.addCourse("java 1.0")) {
                System.out.println(String.format (p instanceof Student ? "%1s har allerede bestået dette kursus." : "%1s kan ikke undervise i dette fag.",p.getName()) );


//                if (p instanceof Student) {
//                    System.out.println(" har allerede bestået dette kursus.");
//
//                }
//                else{
//                    System.out.println(" kan ikke undervise i dette fag.");
//
//                }
            }

        }

    }
}