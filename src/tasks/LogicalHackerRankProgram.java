package tasks;



 import java.util.Scanner;
public class LogicalHackerRankProgram {



    public static void main(String[] args) {

        // Input: lengths of the three sides
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the length b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the length c: ");
        int c = scanner.nextInt();

        // Check for triangle validity using the triangle inequality theorem
        if (a + b > c && a + c > b && b + c > a) {
            // Check for triangle type
            if (a == b && b == c) {
                System.out.println("The triangle is equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        }

        scanner.close(); // Good practice to close the scanner
    }
}
