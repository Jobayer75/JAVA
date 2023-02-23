
package beginnerjava;

import java.util.Scanner;


public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter two numbers : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.println("Sum = "+result);
        result = num1 - num2;
        System.out.println("Sub = "+result);
        result = num1 * num2;
        System.out.println("Mul = "+result);
        double result2 = (double )num1 / num2;
        System.out.println("Div = "+result2);
        result = num1 % num2;
        System.out.println("Mod = "+result);
        
    }
    
}
