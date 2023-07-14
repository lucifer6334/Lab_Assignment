import java.util.*;
public class multiplication {

	public static void main(String[] args) {
		// WAP to accept a number form user and display multiplication
		int num, result;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		for(int i=1; i<=10; i++) {
		result=num*i;
		System.out.println(result);
		}
	
	}

}
