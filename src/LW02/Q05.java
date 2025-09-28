package LW02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q05 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();


            StringBuilder cleaned = new StringBuilder();
            StringTokenizer st = new StringTokenizer(sentence, " .,!?;:");
            while (st.hasMoreTokens()) {
                cleaned.append(st.nextToken().toLowerCase());
            }


            String original = cleaned.toString();
            String reversed = cleaned.reverse().toString();

            if (original.equals(reversed)) {
                System.out.println("The sentence is a palindrome.");
            } else {
                System.out.println("The sentence is NOT a palindrome.");
            }

            sc.close();
        }
    }


