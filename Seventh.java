import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        long num = input.nextLong();
        long first = 0;
        long second = 1;
        System.out.println("fibonnaci series up to " + num + " is: ");
      for (long i = 1; i <= num; ++i) {
          System.out.print(first + " ");

          long next = first + second;
          first = second;
          second = next;

      }
    }
}
