import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        long num = in.nextLong();
        long number = 0;
        while (num > 0) {
            long rem = num % 10;
            num /= 10;

             number = number * 10 + rem;

        }
        System.out.println(number);
    }
}