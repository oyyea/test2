package test2;

import java.util.Scanner;

public class U3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates:");
		
		double x,y;
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		if(Math.abs(x)<=5&&Math.abs(y)<=2.5) {
			System.out.println("Point (" + x + ", " + y + 
					") is in the rectangle");
		}else {
			System.out.println("Point (" + x + ", " + y + 
					") is not in the rectangle");
		}
	}

}
