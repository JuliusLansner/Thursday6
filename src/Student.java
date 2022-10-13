import java.sql.Array;
import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourse;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        //System.out.println(passedCourses);
        this.passedCourses = passedCourses;
        this.currentCourse = new ArrayList<>();
    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            System.out.println("Course completed");
            return false;
        } else {
            currentCourse.add(course);
        }
        return true;

    }
}
