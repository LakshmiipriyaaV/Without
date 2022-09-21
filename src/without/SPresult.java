package without;
import java.util.Scanner;
public class SPresult
{
	
	public static void main(String[] args) 
	{
		
		Scanner input=new Scanner(System.in);
		
		
		int num1;	
		int num2;	
		int sum;	
		int product;	
		
		System.out.print("Enter first integer: ");	
		num1 = input.nextInt();	
		
		System.out.print("Enter second integer: ");	
		num2 = input.nextInt();	
		
		sum	= num1 + num2;	
		System.out.printf("Sum is %d\n", +sum);	
		
		product	= num1 * num2;	
		
		
		
		System.out.printf("Product is %d\n", +product);	
		System.out.printf("Result for the sum and product ", +sum , +product);
		
	}	

}