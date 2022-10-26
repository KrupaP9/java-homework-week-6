package javaprogrammesweek8;//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class JavaProgramme_9_FibonacciSequence {
    public static void main(String[] args) {
        JavaProgramme_9_FibonacciSequence obj = new JavaProgramme_9_FibonacciSequence();
        obj.fibonacciSequence();
    }

    public void fibonacciSequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fibonacci Series Index:");
        int fibonacciNum = scanner.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + fibonacciNum + "terms: ");
        for (int i = 1; i <= fibonacciNum; i++) {
            System.out.print(firstTerm + ", ");
            //calculate next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        scanner.close();
    }
}
