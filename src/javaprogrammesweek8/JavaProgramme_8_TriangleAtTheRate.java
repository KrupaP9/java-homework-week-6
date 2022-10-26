package javaprogrammesweek8;

import java.util.Scanner;

/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/
public class JavaProgramme_8_TriangleAtTheRate {
    public static void main(String[] args) {
        atMethod();
    }
    public static void atMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
