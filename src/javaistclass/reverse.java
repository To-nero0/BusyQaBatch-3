package javaistclass;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();
         int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;        
            reversedNumber = reversedNumber * 10 + digit;  
            number = number / 10;         
        }

                System.out.println("Reversed Number: " + reversedNumber);

              input.close();
 

	}

}
