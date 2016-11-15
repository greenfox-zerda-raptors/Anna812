import java.util.ArrayList;

/**
 * Created by Anna812 on 11/15/2016.
 */
public class Student extends Person {

    public ArrayList<Integer> grades = new ArrayList<>();
    public float average;

    public Student(String name, int age) {
        super(name, age);
    }

    public void addGrade(int i){
        grades.add(i);
    }

    public float getAverage() {
        float sum = 0;
        for (int i : grades) {
            sum += i;
        }
        average = sum / grades.size();
        return average;
    }

    public String toString() {
        return String.format(super.toString() + " average: " + getAverage());
    }
}
