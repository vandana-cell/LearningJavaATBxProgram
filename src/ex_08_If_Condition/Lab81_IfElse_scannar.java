package ex_08_If_Condition;

import java.util.Scanner;

class Lab81_IfElse_Scanner {

    public static void main(String[] args) {

        // Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // Else -> Not allowed to vote.
        // Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Options
        //
//        int age = Integer.parseInt(args[0]);


        // 2. Scanner Class

        System.out.println("Enter your age:");

        Scanner scanner = new Scanner(System.in);  // Correct class and variable name
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("Allowed to Vote!");
        } else {
            System.out.println("Not allowed to Vote!");
        }

        scanner.close();  // Best practice to close the scanner
    }
}
