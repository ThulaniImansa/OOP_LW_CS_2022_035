package LW01;

import java.util.Scanner;

public class Q02 {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your first name: ");
            String firstName=scanner.nextLine();
            System.out.println("Enter your middle name: ");
            String middleName=scanner.nextLine();
            System.out.println("Enter your last name: ");
            String lastName=scanner.nextLine();
            char middleInitial=middleName.charAt(0);
            System.out.println("Your Name:"+lastName +","+firstName+" "+ middleInitial);
            scanner.close();
        }
}
