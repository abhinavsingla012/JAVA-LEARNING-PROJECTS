import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String name: ");
        String original = input.nextLine();

        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverse = new StringBuilder(original).reverse().toString();

        if (original.equals(reverse)){
            System.out.println(" It is Palindrome");

        } else
            System.out.println("It is not Palindrome");

    }
}
