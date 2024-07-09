import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
        double first = input.nextDouble();
        System.out.print("Second Number: ");
        double second = input.nextDouble();
        System.out.print("Choose an operator(+,-,*,/): ");
        char operator = input.next().charAt(0);

        double result = 0;
        boolean validOperator = true;

        if (operator == '+' ) {
            result = first + second;
        } else
        if (operator == '-'){
            result = first - second;

        } else
        if (operator == '*'){
            result = first*second;
        } else
        if (operator == '/'){
            if (second != 0){
                result = first/second;
            } else {
                System.out.println("Cannot divide it by zero!!");
                validOperator = false;

            }
        }else {
            System.out.println("Invalid Operator!!!!");
            validOperator = false;
        }
                if (validOperator){
                    System.out.println("Your result is " + result);

                }




        }
        }



