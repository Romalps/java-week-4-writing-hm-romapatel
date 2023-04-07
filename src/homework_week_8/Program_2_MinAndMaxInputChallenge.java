package homework_week_8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be 'Enter number #1:, the next Enter number #2:, and so on'.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */
public class Program_2_MinAndMaxInputChallenge {


    public static void findMinAndMaxNumbers() {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        // while loop
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scanner.close();// closing the scanner object
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }

}



