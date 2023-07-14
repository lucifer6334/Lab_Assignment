import java.util.*;
public class taking_radius {
//Write a programe to take radius from the user and find Area of circle and circumferences
	public static void main(String[] args) {
	int radius, result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius of circle: ");
	radius=sc.nextInt();
	double area = Math.PI *radius * radius;
	double circumference = 2 * Math.PI * radius;
	
	System.out.println("The area of circle is: "+ area);
	System.out.println("The circumference of the circle is: "+circumference);
	}

}
