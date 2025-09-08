/**********************************************************************
Program Title : Unary, Binary and Ternary Operators Demonstration
File Name     : "OperatorLevels.java"

Programmer    : Sathish Sarma
Contact Details : sathish.sarma@newinti.edu.my
Date          : 2 September 2025
**********************************************************************/

public class OperatorLevels {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);
        System.out.println("-------------------------------------------");

        // 1. Unary Operators
        System.out.println("Unary Operators:");
        System.out.println(" -a = " + (-a) + " (Unary minus)");
        System.out.println(" ++a = " + (++a) + " (Prefix increment)");
		
		//Update the code to perform the postfix decrement on the variable b
        System.out.println("\n b after b-- = " + (b--)); 
        System.out.println("Value of b after postfix decrement: " + b);
        System.out.println("+b = " + (+b) + " (Unary plus)");
        System.out.println("++b = " + (++b) + " (Prefix increment)\n");

        // Update the code to Reset values of a and b to the original
        a = 10;
        b = 5;
        
        // 2. Binary Operators
        System.out.println("Binary Operators:");
        System.out.println(" a + b = " + (a + b) + " (Addition)");
		
		//Update the code to perform subtraction, b minus from a
		System.out.println(" b - a = " + (b-a) + " (subtraction");
		
		//Update the code to perform multiplication, a multiply with b
		System.out.println(" b * a = " + (b*a) + " (Multiply)");
		
		//Update the code to perform division, divide b from a
		System.out.println(" b / a = " + (b/a) + " (Devide)");
		
		//Update the code to find the remainder of the process a divide b
        System.out.println(" a % b = " + (a%b) + " (Remainder)");
        
        System.out.println();

        // 3. Ternary Operator
        System.out.println("Ternary Operator:");
		
		//update the code to determine the value of a is odd or even using ternary operator
		String result = (a % 2 == 0) ? "even" : "odd";
		System.out.println("The value of a (" + a + ") is " + result + ".");
		System.out.println("\nProgram completed successfully.");

    }
}
