package javaprogrammesweek8;

import java.util.Scanner;

/*3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant*/
public class JavaProgramme_3_VowelOrConsonant {
    public static void main(String[] args) {
        vowelOrConsonant();
    }

    public static void vowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your character: ");
        String letter = scanner.next();
        if (letter.length()==1 && Character.isAlphabetic(letter.charAt(0))) {
            char lowerLetter = Character.toLowerCase(letter.charAt(0));
            if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' || lowerLetter == 'o' || lowerLetter == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Invalid Entry");
        }
        scanner.close();
    }
}
