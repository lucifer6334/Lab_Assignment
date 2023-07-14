import java.util.*;

public class SP_CP {

    public static void main(String[] args) {
        int selling_price, cost_price, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling price ");
        selling_price = sc.nextInt();
        System.out.println("Enter Cost price ");
        cost_price = sc.nextInt();

        result = selling_price - cost_price;

        if (result == 0) 
        {
            System.out.println("Neither profit nor loss");
        } 
        else if (result > 0) {
            System.out.println("You profit= "+ result);
        }
        else
        {
        	System.out.println("Loss="+(-result));
        }
    }
}
