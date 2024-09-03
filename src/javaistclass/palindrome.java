package javaistclass;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("type in an input:");
		String letter = input.next();

      String rev = "";  
      
          for ( int i = letter.length() - 1; i >= 0; i-- )
        	  rev = rev + letter.charAt(i);
          
          if (letter.equals(rev)) {
         System.out.println(letter+" is a palindrome");
          } else { 
         System.out.println(letter+" is not a palindrome");
          }
         input.close(); 
    

		}

}
