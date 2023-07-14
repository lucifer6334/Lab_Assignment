import java.util.*;
public class find_greatest {
	// WAP to accept three numbers for the user and find greatest
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		num1=sc.nextInt();
		System.out.println("Enter second number :");
		num2=sc.nextInt();
		System.out.println("Enter third number :");
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.println("The greatest number is: " + num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("The greatest number is: "+num2);
		}
		else if(num3>num1 && num3>num1) {
			System.out.println("The greatest number is:"+num3);
		}
		else {
			System.out.println("Enter a valid number");
		}
	}

}
