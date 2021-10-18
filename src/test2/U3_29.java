package test2;

import java.util.Scanner;

public class U3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1,y1,r1;
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		r1=sc.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2,y2,r2;
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		r2=sc.nextDouble();
		
		if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=Math.abs(r2-r1)) {
			System.out.println("circle2 is inside circle1");
		}else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=r2+r1) {
			System.out.println("circle2 overlaps circle1");
		}else {
			System.out.println("circle2 does not overlap circle1");
		}

	}

}
