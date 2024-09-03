package javaistclass;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input number:");
		 int i,fact=1; 
		int num = input.nextInt();
	 
		  for(i=1;i<=num;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+num+" is: "+fact);    
		  input.close();
	}

}
