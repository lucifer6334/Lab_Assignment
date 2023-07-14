import java.util.*;
public class if_else {
//write a program to take number from user and find the greatest number
	public static void main(String[] args) 
	{
		int num1, num2, result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		
		if(num1>num2) {
			result=num1;
			System.out.println("Num1 is the greatest" +num1);
			}
		else if(num1==num2) {
			System.out.println("Both are equal");		
			}
		
		else
		{
			System.out.println("Num2 is the greatest"+num2);
		}
		
		}
		
		
}
