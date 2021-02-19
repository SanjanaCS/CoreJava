package test;

public class PrimeNum {
	public static void main(String[] args) {
//		int i = 8;
//		for(int j =2; j< i/2; j++) {
//			if(i%j == 0) {
//				System.out.println("Not a prime");
//			}
//			else {
//				System.out.println("Is a prime");
//			}
//		}
		int n=8;
		int c = 0;
		for(int i=n;i>0;i--) {
			if(n%i==0) {
				c++;
			}
		}
		if(c == 2) {
			System.out.println("Number a prime");
		}
		else {
			System.out.println("number is Not a prime");
		}
	}
}
