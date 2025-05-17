package tasks;

public class maximumofthree {

    public static void main(String[] args) {
        int N1 = 3, N2 = 4, N3 = 5;
        int max = (N1 > N2) ? ((N1 > N3) ? N1 : N3) : ((N2 > N3) ? N2 : N3);
        System.out.println("The maximum number is: " + max);



    }
}
