import java.util.ArrayList;


public class Aufgabe5 {
    public static void main(String[] args)
    {
        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student("Disgrace",  1810653904, 2018));
        student.add(new Student("Disappointment", 181065369, 2018));
        student.add(new Student("Living Trash", 1810653499, 2018));

        for(Student object: student) {
            System.out.println(object);
        }
    }
}
