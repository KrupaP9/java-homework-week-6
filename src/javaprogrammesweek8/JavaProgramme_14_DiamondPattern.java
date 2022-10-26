package javaprogrammesweek8;

import java.util.Scanner;

/*14. Write a program in Java to display the pattern like a diamond.
While loop
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
public class JavaProgramme_14_DiamondPattern {
    public static void main(String[] args) {
        diamondPattern();
    }

    public static void diamondPattern() {
        int i, j, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows in diamond (top half): ");
        r = scanner.nextInt();
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");

        }
        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");

        }
        scanner.close();
    }
}
