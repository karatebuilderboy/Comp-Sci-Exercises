import java.util.Scanner;

public class NumDigits {
	
	public static void main (String[] args) {
		
		Scanner NumDigits = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int number = NumDigits.nextInt();
		NumDigits.close();
		
		String abs;
		
		abs = String.valueOf(Math.abs(number)); //abs is absolute of number
		System.out.println(abs.length()); //Length of abs is printed
		
	}
	
}
