package test;

public class TypeCasting {
	
	public static void main(String[] args) {
		System.out.println("Implicit TypeCasting");
		
		char a = 'A';
		System.out.println("Value of a :" +a);
		
		int b = a;
		System.out.println("Value of b :" +b);
		
		//explicit conversion
		System.out.println("Explicit TypeCasting");
		
		double x = 45.5;
		int y = (int) x;
		System.out.println("Value of x :" +x);
		System.out.println("Value of y :" +y);
		
		
	}

}
