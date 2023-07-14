import java.util.*;
public class accept_age {
	// WAP to accept age and check eligible for voting or not
	public static void main(String[] args) {
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age: ");
		age=sc.nextInt();
		
		if(age<0) {
			System.out.println("Please enter a valid number");
		}
		
		else if(age<18) {
			System.out.println("Sorry you are not eligible for Vote");
		}
			else if(age>18) {
				System.out.println("Congratulation you are eligible for Vote");
			}
		
	}

}
