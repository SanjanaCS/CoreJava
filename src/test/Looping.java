package test;

public class Looping {
	public static void main(String[] args) {
		
		int i = 0;
		//Entry control loop
		while(i<5) {
			System.out.println("value of i is:"+i);
			i = i+1;
		}
		//exit control loop
		int j = 0;
		do {
			System.out.println("Value of j is:" +j);
			j++;
		}while(j<5);
		
		for(int k=0;k<5;k++) {
			System.out.println("Value of k is:" +k);
		}
		
		int arr[] = {12,23,44,56,78};
		for(int l: arr) {
			System.out.println(l);
		}
	}

}
