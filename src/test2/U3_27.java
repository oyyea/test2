package test2;

import java.util.Scanner;

public class U3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		
		double x,y;
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		if(x>=0&&x<=200&&y<=100.0-0.5*x) {
			System.out.println("The point is in the triangle");
		}else {
			System.out.println("The point is not in the triangle");
		}

	}

}
