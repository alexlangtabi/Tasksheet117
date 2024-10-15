package largestNumber;

import java.util.Scanner;

public class largeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int num1;
        int num2;
        System.out.println("This program will check whose largest number in 3 inputs?");
        System.out.println();
        System.out.println("Input first number: ");
        num = input.nextInt();
        System.out.println("Input Second number: ");
        num1 = input.nextInt();
        System.out.println("Input third number: ");
        num2 = input.nextInt();

        int largest = num;

        if (num1 > largest) {
            largest = num1;
            System.out.println(largest + " is the largest number.");
        }
        if (num2 > largest) {
            largest = num2;
            System.out.println(largest + " is the largest number.");
        }
        if ( num == num1 && num1 == num2) {
            System.out.println(num + "," + num1 + "," + num2 + " All number is equal");
        }

        input.close();

    }
}
