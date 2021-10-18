package test2;

import java.util.Scanner;

public class U3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates:");
		
		double x,y;
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		if(Math.sqrt(x*x+y*y)<=10) {
			System.out.println("Point (" + x + ", " + y + 
					") is in the cricle");
		}else {
			System.out.println("Point (" + x + ", " + y + 
					") is not in the cricle");
		}
	}

}
