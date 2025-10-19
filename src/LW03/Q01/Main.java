package LW03.Q01;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            Temperature temp= new Temperature();
            System.out.println("Enter temperature in celsius: ");
            double c=input.nextDouble();
            temp.setCelsius(c);
            System.out.println("Celsius value you enter: "+temp.getCelsius());

            System.out.println("Equivalent fahrenheit = "+temp.getFahrenheit());
            input.close();

        }
    }



