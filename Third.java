
import java.text.NumberFormat;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        long p = input.nextLong();
        System.out.print("Rate: ");
        int r = input.nextInt();
        System.out.print("Time: ");
        byte t = input.nextByte();
        double result = (double)(p * (float)r/100 * t)/100;
        String resultFormatted = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Simple Interest: " + resultFormatted);
    }
}
