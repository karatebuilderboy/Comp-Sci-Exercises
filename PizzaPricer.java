import java.util.Scanner;
import java.util.Random;

public class PizzaPricer{
	
	public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter pizza diameter in inches: ");
		
		float diameter = reader.nextInt();
		reader.close();
		
		System.out.println("Pizza costs: $" + (0.75+1+(0.05*diameter*diameter)));
		
	}
	
}
