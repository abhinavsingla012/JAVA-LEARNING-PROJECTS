import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();
        if (num>0){
            if(num % 2 == 0) {
                System.out.println("it is even.");}
             if (num % 2 > 0){
                 System.out.println("It is odd");
             }
            }
        }

    }
