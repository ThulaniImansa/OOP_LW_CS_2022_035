package LW01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd length word: ");
        String word = scanner.nextLine();
        if (word.length() % 2 != 0 ) {
            int middleIndex = word.length() / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println("The middle character is: " + middleChar);

        } else {
            System.out.println("The word does not have an odd length");

        }
    }

}
