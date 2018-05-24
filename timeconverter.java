/* Peter Ganunis
 * 24 May 2018
 * Period 4A
 */

package chapter4;
import java.util.Scanner;

public class timeConversion {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Time in minutes:");
		int first = reader.nextInt();
		reader.close();
		
		int hours = first/60;
		int minutes = first%60;
		int hourstemp = ((hours - (12 * (((hours + 1)/12) -1)))%13 + 1);
		int hoursreadout = hourstemp - hourstemp/12;
		
		int timetemp = (hoursreadout*1000) + minutes;
		String timestring = timetemp + "";
		
			System.out.println(timestring.substring(0, 2) + ":" + timestring.substring(2, 4));
	}
}
