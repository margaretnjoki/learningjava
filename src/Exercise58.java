public class Exercise58 {
    public static void main(String[] args) {
        displayStudentsName("Maggie");
        calculateTotalMarks(30,40,60);
        int total = calculateTotalMarks(30, 40, 60);
        averageMarks(total );
        double average=total/(double)3;
        passedOrFailed(average);
    }

    public static void displayStudentsName(String name) {
        System.out.println("Student Name: " + name);
    }

    public static int calculateTotalMarks(int mark1, int mark2, int mark3) {
        return mark1 + mark2 + mark3;
    }

    public static double averageMarks(int total) {
        return total / (double) 3;
    }

    public static void passedOrFailed(double average) {
        if (average >= 50) {
            System.out.println(" Result : PASS");
        } else {
            System.out.println(" Result : FAIL");

        }
    }
}
