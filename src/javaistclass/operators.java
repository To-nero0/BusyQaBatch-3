package javaistclass;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 11;
//				int b = 5;
//				int sum = a+b;
//				
//				int sub = a-b;
//				int  divide = a/b;
//				int modulus = a%b;
//				System.out.println ("Addition A and B equals: " +sum);
//				System.out.println ("subtraction A and B equals: " +sub);
//				System.out.println ("division A and B equals: " +divide);
//				System.out.println ("modulus A and B equals: " +modulus);
		int a = 5;
		int b = 6;
		int c = 5;
//		boolean isEqual = (a == b);
//        boolean isNotEqual = (a != b);
//        boolean isGreaterThan = (a > b);
//        boolean isLessThan = (a < b);
//        boolean isGreaterOrEqual = (a >= b);
//        boolean isLessOrEqual = (a <= b);
//        
//        System.out.println("condition value equals check: isEqual :" + isEqual);
//        System.out.println("condition value equals check: isNotEqual :" + isNotEqual);
//        System.out.println("condition value equals check: isGreaterThan :" + isGreaterThan);
//        System.out.println("condition value equals check: isLessThan :" + isLessThan);
//        System.out.println("condition value equals check: isGreaterOrEqual :" + isGreaterOrEqual);
//        System.out.println("condition value equals check: isLessOrEqual :" + isLessOrEqual);
		
		boolean logAnd = ((a==c) && (a<b));
		boolean logAndfalse = ((a!=c) && (a<b));
		boolean logicalOr = ((a==c) || (a<b));
		boolean logicalOrfasle = ((a!=c) || (a>b));
		boolean logicalnot = (!(a==c));
		
		System.out.println("condition value equals check: logAnd :" + logAnd);
		System.out.println("condition value equals check: logAndfalse :" + logAndfalse);
		System.out.println("condition value equals check: logicalOr :" + logicalOr);
		System.out.println("condition value equals check: logicalOrfasle :" + logicalOrfasle);
		System.out.println("condition value equals check: logicalnot :" + logicalnot);
		
		String FirstName = "Srikant";
		String LastName = "Kumar";
		String FullName = FirstName + " " + LastName;
		System.out.println("Full Name is: "+FullName );

	}

}
