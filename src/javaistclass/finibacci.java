package javaistclass;
import java.util.Scanner;

public class finibacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.println("Enter the start of the range: ");
        int FirstNum = input.nextInt();
        System.out.print("Enter the end of the range: ");
        int LastNum = input.nextInt();

        System.out.println("Fibonacci Series in the range " + FirstNum + " to " + LastNum + ":");

        int first = 1, second = 1;

       
        if (FirstNum <= first && first <= LastNum) {
            System.out.print(first + " ");
        }

    
        if (FirstNum <= second && second <= LastNum) {
            System.out.print(second + " ");
        }

      
        int next = first + second;
        while (next <= LastNum) {
            if (next >= FirstNum) {
                System.out.print(next + " ");
            }
            first = second;
            second = next;
            next = first + second;  
        }

     
        input.close();
    }
}

