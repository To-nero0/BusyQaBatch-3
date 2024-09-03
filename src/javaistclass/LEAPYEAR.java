package javaistclass;

import java.util.Scanner;

public class LEAPYEAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a YEAR from 2012 - 2024: ");
	    int Year = scanner.nextInt();
	    
	    switch (Year) {
	      case 2012:
	        System.out.println("2012 is a Leap Year");
	        break;
	      case 2013:
	        System.out.println("2013 is not a Leap Year");
	        break;
	      case 2014:
	        System.out.println("2014 is not a Leap Year");
	        break;
	      case 2015:
	        System.out.println("2015 is not a Leap Year");
	        break;
	      case 2016:
	        System.out.println("2016 is a Leap Year");
	        break;
	      case 2017:
	        System.out.println("2017 is not a Leap Year");
	        break;
	      case 2018:
	        System.out.println("2018 has 31 days");
	        break;
	      case 2019:
		        System.out.println("2019 is not a Leap Year");
		        break;
		      case 2020:
		        System.out.println("2020 is a Leap Year");
		        break;
		      case 2021:
		        System.out.println("2021 is not a Leap Year");
		        break;
		      case 2022:
		        System.out.println("2022 is not a Leap Year");
		        break;
		      case 2023:
			  System.out.println("2023 is  not a Leap Year");
			   break;
		      case 2024:
		        System.out.println("2024 is  a Leap Year");
		        break;    }
	    scanner.close();

	}

}
