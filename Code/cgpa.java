package LANGUAGE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class cgpa implements cgpa {
    public static void main(String[] args) {
        System.out.println("Fill the Answer to get CGPA Accuarte result");
        System.out.print("How Many Subject Do You Have ");
        Scanner get = new Scanner(System.in);
        final int totalSubject = get.nextInt();
        String subMark[][] = new String[totalSubject][2];
        System.out.println("enter all the subject that you have \"Press enter for each subject\"");
        for (int i = 0; i < (totalSubject); i++)
            subMark[i][0] = get.next();
        System.out.println("Enter the Marks rescpective for the subjeact");
        for (int j = 0; j < totalSubject; j++) {
            System.out.print(subMark[j][0] + " = ");
            subMark[j][1] = get.next();
        }
        int total = 0;
        for (int i = 0; i < (totalSubject); i++)
            total = total + Integer.parseInt(subMark[i][1]);
        float verification = (total) / (totalSubject);

        System.out.print("For How Many mark do you write for your exam  ");
        byte examMark = get.nextByte();
        float result = 0;

        if (verification < examMark) {
            int divider = (examMark * totalSubject) / 10;
            Float dividerResult = (float) (examMark * totalSubject) / divider;
            result = verification / dividerResult;

        } else
            System.out.println("error check the subject marks and exam mark properly");

        System.out.println(result);

    }
}
