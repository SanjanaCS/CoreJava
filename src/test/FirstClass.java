package test;

public class FirstClass {
	
	int age;
	String Name;
	float Salary;
	
	public void display() {
		System.out.println("Inside display");
	}
	public static <ThirdClass> void main(String[] args) {
		System.out.println("hello world");
		
		SecondClass obj1 = new SecondClass();
		obj1.Show("Rahul");
		
		SecondClass obj2 = new SecondClass();
		obj2.Show("harish");
		
		obj2.Calculate();
		
		
		
	}
}


