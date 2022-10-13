import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String>canTeach = new ArrayList<>();
    ArrayList<String>currentCourse = new ArrayList<>();

    public Teacher(String name,ArrayList canTeach){
        super(name);
        this.canTeach = new ArrayList();
    }

    @Override
    public boolean addCourse(String course){
        if(canTeach.contains(currentCourse)){
            currentCourse.add(course);
            return true;
        }
        return false;
    }


}

