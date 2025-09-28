package LW02;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];


        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }


        Arrays.sort(numbers);


        int largest = numbers[numbers.length - 1];
        int secondLargest = Integer.MIN_VALUE;


        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] != largest) {
                secondLargest = numbers[i];
                break;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All numbers are the same. No distinct second-largest element.");
        } else {
            System.out.println("Second-largest element: " + secondLargest);
        }

        sc.close();
    }
}
