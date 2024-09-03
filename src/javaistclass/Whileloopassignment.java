package javaistclass;
import java.util.Scanner;
public class Whileloopassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		          System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        int count = 0;

		        if (number == 0) {
		            count = 1;
		        } else {
	
		            while (number != 0) {
		                number = number / 10;
		                count++;
		            }  }

		        System.out.println("The number has " + count + " digits.");
		        scanner.close();

	}

}
