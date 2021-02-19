package test;

public abstract class ParentClass {
	int Empno = 101;
	public void display() {
		System.out.println(Empno);
	}
	
	abstract void run();
	abstract void horn();
	abstract void safety();

}
