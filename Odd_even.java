import java.util.*;
public class Odd_even {
	public static void main(String[] args) {
		// WAP to accept a num from user and find out odd and even
		int num, result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		if(num % 2 ==0) {
			System.out.println("This is a Even number");
		}
		
		else {
			System.out.println("This is a Odd number");
		}
	}

}
