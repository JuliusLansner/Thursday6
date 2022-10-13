
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static ArrayList<String> passedCourse = new ArrayList<>();

    static ArrayList<String> canTeach = new ArrayList<>();

    static ArrayList<String> persons = new ArrayList<>();



    public static void main(String[] args) {
        passedCourse.add("Bio");
        passedCourse.add("fys");
        passedCourse.add("mat");
        passedCourse.add("java 1");

        Student s1 = new Student("S1",passedCourse);
        Student s2 = new Student("S2",passedCourse);
        Teacher t1 = new Teacher("xd",canTeach);
        System.out.println(s1);



    }




}
/*
3.7 Kør din persons-liste igennem med en for-løkke og tilføj kurset "Java 1.0" til dem alle (sørg for at nogle af dine
 studerende allerede har bestået dette og andre ikke har, samt at nogle af underviserne er kvalificerede til at undervise
 i det og andre ikke er). Hver gang ét af dine kald til addCourse() returnerer false, skal du printe navnet på den
 studerende eller underviseren. Hvis det er en Student skal du også printe " har allerede bestået dette kursus." og hvis
det er en Teacher skal du også printe " kan ikke undervise i dette fag".
 */