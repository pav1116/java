#11

import java.util.Scanner;
public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double num1,num2,result;
        char operator;
        try 
        {
          System.out.print("Enter the first number: ");
          num1 = Double.parseDouble(sc.nextLine());
          
          System.out.print("Enter the second number: ");
          num2 = Double.parseDouble(sc.nextLine());

          System.out.print("Enter the operator (+, -, *, /, %):");
            
          operator = sc.nextLine().charAt(0);
          
            switch (operator) 
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) 
                    {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    else
                    {
                     result = num1 / num2;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator.");
            }

            System.out.println("Result: " + result);
        }
        
        catch (ArithmeticException e) 
        {
            System.out.println(e.getMessage());
        } 
        
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}

***OUTPUT***

Enter the first number: 5
Enter the second number: 5
Enter the operator (+, -, *, /, %):%
Result: 0.0


