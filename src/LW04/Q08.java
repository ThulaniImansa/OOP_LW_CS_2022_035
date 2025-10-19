package LW04;

import java.util.Scanner;

public class Q08 {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number to display it's multiplication table: ");
            int N = input.nextInt();
            System.out.println("\n Multiplication table for "+ N+":");
            for (int i=1;i<=10;i++){
                System.out.println(N +" X "+ i +" = "+ (N*i));
            }
            input.close();

        }
    }


