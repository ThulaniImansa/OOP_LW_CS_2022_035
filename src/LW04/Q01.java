package LW04;

import java.util.Scanner;

public class Q01 {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1=input.nextInt();
            System.out.println("Enter the second number: ");
            int num2= input.nextInt();
            System.out.println("Enter the third number: ");
            int num3= input.nextInt();

            int smallest;
            if(num1<=num2 && num1<=num3){
                smallest=num1;
            } else if (num2<=num1 && num2<=num3) {
                smallest=num2;

            }else {
                smallest=num3;
            }
            System.out.println("Smallest number is "+smallest);
        }
    }


