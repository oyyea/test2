package test2;

import java.util.Scanner;

public class U5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loan=sc.nextDouble();
		
		System.out.print("Number of Years: ");
		double year=sc.nextDouble();
		
		System.out.print("Annual Interest Rate: ");
		double rate=sc.nextDouble()/1200;
		
		double mpay=(loan*rate)/(1-1/Math.pow(1+rate, year*12));
		System.out.printf("\nMonthly Payment: %.2f\n",mpay);
		double talpay=mpay*year*12;
		System.out.printf("Total Payment: %.2f\n\n",talpay);
		
		System.out.printf("%-15s%-15s%-15s%-15s\n","Payment#","Interest","Principal","Balance");
		for(int i=1;i<=12;i++) {
			System.out.printf("%-15d",i);
			double inte,prin,bala;
			inte = rate*loan;
			prin=mpay-inte;
			loan = loan-prin;
			System.out.printf("%-15.2f%-15.2f%-15.2f\n",inte,prin,loan);
		}
	}

}
