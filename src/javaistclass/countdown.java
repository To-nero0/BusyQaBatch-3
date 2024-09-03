package javaistclass;
import java.util.Scanner;
public class countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a number: ");
		
		int countdown = scanner.nextInt();
		
	    while (countdown > 0) {
	      System.out.println(countdown);
	      countdown--;
	    }
scanner.close();
	}

}
