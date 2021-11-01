import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Driver {
    public static void main(String args[]){
        Student student1 = new Student("Shain",21, DateTime.parse("11/02/2000", DateTimeFormat.forPattern("dd/MM/yyyy")),"18331093");
        Student student2 = new Student("Cian",22, DateTime.parse("21/05/1999", DateTimeFormat.forPattern("dd/MM/yyyy")),"18371054");
        Student student3 = new Student("Ellie",23, DateTime.parse("01/01/1998", DateTimeFormat.forPattern("dd/MM/yyyy")),"17891254");

        Module module1 = new Module("Machine Learning","CT4101");
        Module module2 = new Module("Software Engineering III","CT417");

        Course course1 = new Course("Computer Science", DateTime.parse("01/10/2021", DateTimeFormat.forPattern("dd/MM/yyyy")),DateTime.parse("30/06/2022",DateTimeFormat.forPattern("dd/MM/yyyy")));
        Course course2 = new Course("Engineering", DateTime.parse("01/10/2021", DateTimeFormat.forPattern("dd/MM/yyyy")),DateTime.parse("30/06/2022",DateTimeFormat.forPattern("dd/MM/yyyy")));

//        //Adding the courses to students
        student1.addCourses(course1);
        student2.addCourses(course1);
        student3.addCourses(course2);

        //Adding the modules to students
        student1.addModules(module1);
        student1.addModules(module2);
        student2.addModules(module1);
        student2.addModules(module2);
        student3.addModules(module2);

        //Adding the courses to the modules
        module1.addCourses(course1);
        module2.addCourses(course1);
        module2.addCourses(course2);

        System.out.println("Students :");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Modules :");
        System.out.println(module1);
        System.out.println(module2);

        System.out.println("Courses :");
        System.out.println(course1);
        System.out.println(course2);
    }
}