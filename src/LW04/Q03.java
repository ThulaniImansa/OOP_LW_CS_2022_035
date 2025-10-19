package LW04;

import java.util.Scanner;

public class Q03 {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a power of 10 (e.g. 6, 9, 12, 15, 18, 21, 30, 100): ");
            int power= input.nextInt();
            switch (power){
                case 6:
                    System.out.println("That's Million");
                    break;
                case 9:
                    System.out.println("That's Billion");
                    break;
                case 12:
                    System.out.println("That's Trillion");
                    break;
                case 15:
                    System.out.println("That's Quadrillion");
                    break;
                case 18:
                    System.out.println("That's Quintillion");
                    break;
                case 21:
                    System.out.println("That's Sextillion ");
                    break;
                case 30:
                    System.out.println("That's Nonillion");
                    break;
                case 100:
                    System.out.println("That's Googol ");
                    break;
                default:
                    System.out.println("No common name for that power of 10.");
            }
        }
    }


