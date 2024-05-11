import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        System.out.println("Fill the Answer to get CGPA result");
        System.out.print("How Many Subject Do You Have: ");
        Scanner scanner = new Scanner(System.in);
        final int totalSubject = scanner.nextInt();
        String subMark[][] = new String[totalSubject][2];
            System.out.println("Enter the Marks");
        for (int j = 0; j < totalSubject; j++) {
            System.out.print(++j + " = ");
            --j;
            subMark[j][1] = scanner.next();
        }
        int total = 0;
        for (int i = 0; i < totalSubject; i++)
            total += Integer.parseInt(subMark[i][1]);
        float averageMark = (float) total / totalSubject;

        System.out.print("Enter the total mark for your exam: ");
        int examMark = scanner.nextInt();
        float cGPA = 0;

        if (averageMark < examMark) {
            int divider = (examMark * totalSubject) / 10;
            float dividerResult = (float) (examMark * totalSubject) / divider;
            cGPA = averageMark / dividerResult;

        } else {
            System.out.println("Error: Please check the subject marks and exam mark properly");
        }

        System.out.println("Your CGPA: " + cGPA);

    }
}
