package test2;

import java.util.Scanner;

public class U3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int year,month,day;
		System.out.print("Enter year: (e.g., 2012): ");
		year=sc.nextInt();
		System.out.print("Enter month: ");
		month=sc.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		day=sc.nextInt();
		
		int h,q=day,m,j,k;
		m=month;
		if(m==1) {
			m=13;
			year-=1;
		}
		else if(m==2) {
			m=14;
			year-=1;
		}
		j=year/100;
		k=year%100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		
		System.out.print("Day of the week is ");
		switch(h) {
		case 0:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		}

	}

}
