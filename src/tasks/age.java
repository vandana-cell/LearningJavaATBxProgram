package tasks;

public class age {

    public static void main(String[] args) {


            // Using a nested ternary operator to determine the category
        int age = 68;
        String result = age > 65 ? "I am senior" : (age >= 18 ? "i am adult" : "i am minor");

        System.out.println(result);
        }
    }
