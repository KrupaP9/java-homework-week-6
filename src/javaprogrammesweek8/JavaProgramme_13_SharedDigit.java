package javaprogrammesweek8;

import java.util.Scanner;

/*13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static*/
public class JavaProgramme_13_SharedDigit {
    public static void main(String[] args) {
        //System.out.println(hasSharedDigit(12,23));
        //System.out.println(hasSharedDigit(11,23));
        //System.out.println(hasSharedDigit(1,3));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        hasSharedDigit(number1,number2);
        scanner.close();
    }
    public static boolean hasSharedDigit(int number1, int number2){
        if((number1<10||number1>99) || (number2<10||number2>99)){
            System.out.println("false");
            return false;
        }else if((number1/10==number2/10)||(number1%10==number2%10)||(number1/10==number2%10)||(number1%10==number2/10)){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
