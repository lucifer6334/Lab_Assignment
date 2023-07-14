import java.util.*;
public class switch_case {

	public static void main(String[] args) {
		// write a programe using switch case which display the all option of operators
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operatorSymbol = scanner.next().charAt(0);
	        switch (operatorSymbol) {
	            case '+':
	                System.out.println("Addition operator");
	                break;
	            case '-':
	                System.out.println("Subtraction operator");
	                break;
	            case '*':
	                System.out.println("Multiplication operator");
	                break;
	            case '/':
	                System.out.println("Division operator");
	                break;
	            default:
	                System.out.println("Invalid operator");
	                break;
	        }
	}

}
