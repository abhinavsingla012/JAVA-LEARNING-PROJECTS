import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double result = (long)0;
        while (true) {
            System.out.print("Enter the operation u want to do: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' || op == '^') {

                System.out.print("Enter the two numbers: ");
                double num1 = in.nextLong();
                double num2 = in.nextLong();


                {
                    if (op == '+') {
                         result = num1 + num2;
                    }
                    if (op == '-') {
                       result = num1 - num2;
                    }
                    if (op == '*') {
                      result = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            result = num1 / num2;
                        }
                    }
                    if (op == '%') {
                         result = num1 % num2;
                    }

                    if (op == '^') {
                       result = Math.pow(num1, num2);

                    }

                }
                System.out.println("Your answer is: " + result);


                    }else if (op == 'x' || op == 'X' ) {
                break;


            }else
                System.out.println("INVALID OPERATION!!!!");
            }


                }
            }


