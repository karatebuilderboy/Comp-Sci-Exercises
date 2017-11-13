import java.util.Scanner;

public class BurgerPrice {
	
	public static void main (String[] args) {
		int burgers, fries, sodas;
		Scanner Scan = new Scanner(System.in);

		System.out.println("Number of Burgers");
		burgers = Scan.nextInt();
		
		System.out.println("Number of Fries");
		fries = Scan.nextInt();

		System.out.println("Number of Sodas");
		sodas = Scan.nextInt();
		
		Scan.close();
		
		float total, tax;
		
		total = (float) (((burgers)*1.69)+((fries)*1.09)+((sodas)*0.99));
		tax = (float) ((float) (Math.ceil(((total)*(0.065)*100)))/100);
		
		System.out.println("Total before tax: " + total);
		System.out.println("Tax: " + tax);
		System.out.println("Total after tax: " + (total+tax));
		
	}
	
}
