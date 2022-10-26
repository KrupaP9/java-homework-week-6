/*11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static*/
package javaprogrammesweek8;

import java.util.Scanner;

public class JavaProgramme_11_EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        getEvenDigitSum(number);
        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        int sumEven = 0;
        if (number > 0) {
            while (number != 0) {
                int lastNumber = number % 10;
                number = number / 10;
                if (lastNumber % 2 == 0) {
                    sumEven += lastNumber;
                }
            }
            System.out.println("Sum of even digits is "+sumEven);
        } else {
            System.out.println(-1+ " Error");
            return -1;
        }
        return sumEven;
    }
}

