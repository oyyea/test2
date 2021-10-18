package test2;

import java.util.Scanner;

public class U5_28 {

	static String [] m = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
	static String [] weekName = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number as year£º");
		int year = sc.nextInt();
		System.out.print("Enter the day of the week the first day of the year£º");
		int day = sc.nextInt();
		
		int[] days = makeSureDays(year);
		
		for(int i = 1; i <= 12; i++) {
			System.out.println(m[i - 1] + " " + 1 + ", " + year + " is " + weekName[day]);
			day=(day+days[i-1])%7;
		}
	}
	
	public static int[] makeSureDays(int year) {
		int[] leapDays = {
			31,29,31,30,31,30,31,31,30,31,30,31
		};
		int[] nonLeapDays = {
			31,28,31,30,31,30,31,31,30,31,30,31
		};
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return leapDays;
		else
			return nonLeapDays;
	}

}
