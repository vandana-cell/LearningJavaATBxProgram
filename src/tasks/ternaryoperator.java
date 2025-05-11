package tasks;// syntax of teranary operator condition ? expression_if_true : expression_if_false;

public class ternaryoperator {
    public static void main(String[] args) {
        int number = 7; // You can change this to any number
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result );//here we used concatenation
    }
}

