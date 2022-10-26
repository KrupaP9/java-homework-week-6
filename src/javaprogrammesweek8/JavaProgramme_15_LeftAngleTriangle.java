/*15. Display left angle triangle of * using nested for loops
        *
        * *
        * * *
        * * * *
        * * * * **/
package javaprogrammesweek8;

import java.util.Scanner;

public class JavaProgramme_15_LeftAngleTriangle {
    public static void main(String[] args) {
        leftAngleTriangle();
    }

    public static void leftAngleTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows - j; i++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
