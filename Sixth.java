import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Value(in IND Rs): ");
        long ind = input.nextLong();
        double usa = (double)ind / 83.48;
        System.out.println("Value(in USD): $" + usa);

    }
}
