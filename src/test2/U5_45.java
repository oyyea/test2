package test2;

import java.util.Scanner;

public class U5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 10 number: ");
		
		double []a=new double[10];
		double sum=0,sum2=0;
		for(int i=0;i<10;i++) {
			a[i]=sc.nextDouble();
			sum+=a[i];
			sum2+=a[i]*a[i];
		}
		
		double ave=sum/10.0,stand=Math.sqrt((sum2-sum*sum/10.0)/9.0);
		System.out.printf("The mean is %.2f\n",ave);
		System.out.printf("The standard deviation is %.5f" , stand);
	}

}
