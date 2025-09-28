package LW02;

import java.util.Scanner;

public class Q02 {
    public static  int countDigits(int number){
        if (number==0){
            return 1;
        }else{
            int count=0;
            while(number>0){
                number=number/10;
                count++;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        while (true){

            System.out.println("Enter a number: ");
            number=sc.nextInt();
            if(number<0){
                break;
            }
            System.out.println("Number of digits "+countDigits(number));



        }
        sc.close();
        System.out.println("Terminate the program");
    }
}
