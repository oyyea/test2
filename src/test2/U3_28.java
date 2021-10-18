package test2;

import java.util.Scanner;

public class U3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1,y1,w1,h1;
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		w1=sc.nextDouble();
		h1=sc.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2,y2,w2,h2;
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		w2=sc.nextDouble();
		h2=sc.nextDouble();
		
		if(Math.abs(y2-y1)+h2/2.0<=h1/2.0&&Math.abs(x2-x1)+w2/2.0<=w1/2.0) {
			System.out.println("r2 is inside r1");
		}else if(Math.abs(y2-y1)>h1/2.0+h2/2.0&&Math.abs(x2-x1)>=w1/2.0+w2/2.0) {
			System.out.println("r2 does not overlap r1");
		}else {
			System.out.println("r2 overlaps r1");
		}
	}

}
