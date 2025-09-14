package LW01;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the centimeter value: ");
        int centi= scanner.nextInt();
        float totalInch=centi/2.54f;
        int feet=(int)(totalInch/12);
        int inch=(int)(totalInch%12);
        System.out.println(centi+"cm = "+feet+" feet  "+inch+" inches");
    }
}
