import java.util.Scanner;
public class Calculator
 {
    public static void main(String args[ ]) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        while (1) 
        {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5)
           {
                System.out.println("Exiting the calculator.");
                break; 
            }

            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            switch (choice)
           {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                   else
                  {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
              System.out.println("Invalid choice.");
            }
        }
    scanner.close();
    }
}