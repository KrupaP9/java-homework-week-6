/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/
package javaprogrammesweek8;

import java.util.Scanner;

public class JavaProgramme_12_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        primeNumber(number);
        scanner.close();
    }

    public static void primeNumber(int number) {
        int count = 0;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }}
                if (count == 2) {
                    System.out.println("This is a prime number");
                } else {
                    System.out.println("This is not a prime number");
                }
            }
        else {
            System.out.println("This is not a prime number");
        }


    }
}

