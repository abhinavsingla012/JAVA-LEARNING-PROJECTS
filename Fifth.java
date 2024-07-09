import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        double first = (long)input.nextDouble();
        System.out.print("Second number: ");
        double second = (long)input.nextDouble();
        if (first > second){
            System.out.println("The largest number is " + first);
        }else if (second > first){
            System.out.println("The largest number is " + second);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
