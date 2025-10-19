package LW03.Q02;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            Temperature temp = new Temperature();


            System.out.print("Enter temperature in Fahrenheit: ");
            double f = input.nextDouble();


            temp.setFahrenheit(f);


            System.out.println("Equivalent Celsius: " + temp.toCelsius());

            input.close();
        }
    }



