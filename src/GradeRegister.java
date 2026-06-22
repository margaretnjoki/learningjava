import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;


    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }
}
