package tasks;

public class maximumofthree {

    public static void main(String[] args) {
        int N1 = 3, N2 = 4, N3 = 5;
        int max = (N1 > N2) ? ((N1 > N3) ? N1 : N3) : ((N2 > N3) ? N2 : N3);
        System.out.println("The maximum number is: " + max);



    }
}
// ternary condition ? value_if_true : value_if_false;
//nested tarnary  condition1 ? (condition2 ? value_if_true1 : value_if_false1) : (condition3 ? value_if_true2 : value_if_false2);