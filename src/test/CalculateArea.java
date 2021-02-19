package test;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square");
		double side = sc.nextDouble();
		
		System.out.println("Enter the base of triangle");
		double base = sc.nextDouble();
		System.out.println("Enter the height of triangle");
		double height = sc.nextDouble();
		
		double areaTriangle = 0.5 * base * height;
		
		double areaSquare = side * side;
		
		System.out.println("Area of Square is" +areaSquare);
		System.out.println("Area of Triangle is" +areaTriangle);

	}

}
