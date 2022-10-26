/*10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/
package javaprogrammesweek8;

import java.util.Scanner;

public class JavaProgramme_10_ArmstrongNumberCheck {
    public static void main(String[] args) {
        JavaProgramme_10_ArmstrongNumberCheck obj = new JavaProgramme_10_ArmstrongNumberCheck();
        obj.armstrongNumber();
    }

    public void armstrongNumber() {
        int userNum, arm = 0, remainder, userNumFixed;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armstrong Number Checker");
        System.out.print("Enter the number: ");
        userNum = scanner.nextInt();
        userNumFixed = userNum;
        while (userNum > 0) {
            remainder = userNum % 10;
            arm = (remainder * remainder * remainder) + arm;
            userNum = userNum / 10;
        }
        if (userNumFixed == arm) {
            System.out.println(userNumFixed + " is an Armstrong Number");
        } else {
            System.out.println(userNumFixed + " is not an Armstrong Number");
        }
        scanner.close();
    }
}
