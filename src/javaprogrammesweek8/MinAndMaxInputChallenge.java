package javaprogrammesweek8;/*2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name javaprogrammesweek8.MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        numMinMax();
    }

    public static void numMinMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (or 0 to stop): ");
        int number = scanner.nextInt();
        int maxNumber = number;
        int minNumber = number;
        while (number != 0) {
            if (number > maxNumber) {
                maxNumber = number;
            } else if (number < minNumber) {
                minNumber = number;
            }
            System.out.print("Enter a number (or 0 to stop): ");
            number = scanner.nextInt();
        }
        if (maxNumber != 0 && minNumber != 0) {
            System.out.println("Maximum of your entry is " + maxNumber);
            System.out.println("Minimum of your entry is " + minNumber);
        }
        scanner.close();
    }
}
