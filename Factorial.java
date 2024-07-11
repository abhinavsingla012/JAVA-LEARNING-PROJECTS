import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        long num = in.nextLong();
        long factorial = 1;
        for (long i = 1; i <=num ; i++) {
          factorial*=i;
        }
        System.out.println("Factorial of the number is " + factorial + ".");
    }
}
