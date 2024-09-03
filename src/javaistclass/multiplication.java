package javaistclass;
import java.util.Scanner;
public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to see Multiples");
		 int number = scanner.nextInt();
		System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
				 
			 
		scanner.close();
	}}

}
