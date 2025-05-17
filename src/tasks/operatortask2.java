package tasks;

public class operatortask2 {

    public static void main(String[] args) {

        int a = 11;
                int b = 22;
                int c=a + b + a++ + b++ + ++a + ++b;

     //  int result = a + b + a++ + b++ + ++a + ++b;
//     c= 11+22+11+22+13+24// a=13,b=24
        //c= 103
        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

    }
}
