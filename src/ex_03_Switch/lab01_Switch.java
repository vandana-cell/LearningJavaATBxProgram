package ex_03_Switch;

import java.util.Scanner;

public class lab01_Switch {
    public static void main(String[] args) {
        // Step 1 - Use Scanner class to get input
        Scanner scanner = new Scanner(System.in);  // Corrected class and variable name

        System.out.println("Enter the day number (1 to 7):");

        // Step 2 - Check if input is an integer
        if (scanner.hasNextInt()) {  // Corrected method call
            int day = scanner.nextInt();

            // Step 3 - Use switch to determine the day
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thu");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter a number from 1 to 7 only!");
            }

        } else {
            System.out.println("Invalid input! Please enter a number.");
        }
    }
}