package test2;

import java.util.Scanner;

public class U3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Please enter three numbers separated by spaces: ");
		
		double a,b,c;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		if(a+b>c&&b+c>a&&c+a>b){
			System.out.println((a+b+c));
		}else {
			System.out.println("Illegal number");
		}

	}

}
