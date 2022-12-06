package calculator;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public class Calculator {
        public static int add(int operand1, int operand2) {
           return operand1 + operand2;
        }

        public static int sub(int operand1, int operand2) {
            return  operand1 - operand2;
        }

        public static int mul(int operand1, int operand2) {
            return  operand1 * operand2;
        }

        public static double div(int operand1, int operand2) {
           return (double) operand1 / operand2;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int operand1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int operand2 = scanner.nextInt();
        System.out.println("Введіть арифметичну дію");
        String sign = scanner.next();
        switch (sign) {
            case "+": {
                System.out.printf("%d + %d = %d", operand1, operand2, Calculator.add(operand1,operand2));
                break;
            }
            case "-": {
                System.out.printf("%d - %d = %d", operand1, operand2, Calculator.sub(operand1,operand2));
                break;
            }
            case "*": {
                System.out.printf("%d * %d = %d", operand1, operand2, Calculator.sub(operand1,operand2));
                break;
            }
            case "/": {
                if (operand2 == 0) {
                    try {
                        int a = operand1/operand2;

                    }
                    catch (ArithmeticException e) {
                        System.err.println(e.getMessage());
                    }
                }
                else {
                    System.out.printf("%d / %d = %.4f", operand1, operand2,Calculator.div(operand1,operand2));
                }
                break;
            }
            default: {
                System.out.println("Введена невірна арифметична дія");
                break;
            }
        }
    }
}
