package tasks;

public class operatorstask3 {

    public static void main(String[] args) {

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        //m=  1 - 2  - 3;
        //m= -4
        // i=0, j=1, k=2

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
