package test2;

import java.util.Scanner;

public class U5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loan=sc.nextDouble();
		
		System.out.print("Number of Years: ");
		double year=sc.nextDouble();
		
		System.out.printf("%-17s%-17s%-17s\n","Interest Rate","Monthly Payment","Total Payment");
		
		for(double rate=5;rate<=8;rate+=0.125) {
			System.out.printf("%.3f%-12s",rate,"%");
			double mpay=(loan*rate*0.01/12)/(1-1/Math.pow(1+rate/12*0.01, year*12));
			System.out.printf("%-17.2f",mpay);
			double talpay=mpay*year*12;
			System.out.printf("%-17.2f\n",talpay);
		}
		
	}

}
