package test2;

import java.util.Scanner;

public class U5_29 {
	
	static String [] m = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number as year£º");
		int year = sc.nextInt();
		System.out.print("Enter the day of the week the first day of the year£º");
		int day = sc.nextInt();
		
		for(int i=1;i<=12;i++) {
			printMonthTitle(i, year);
			day = printMonthBody(day, 1, year);
		}
	}
	
	public static void printMonthTitle(int month, int year) {
		String monthName = m[month-1];
		System.out.println("         " + monthName + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
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

	public static int printMonthBody(int day, int month, int year) {
		int track = 0;
		for(int j = 0; j < (day % 7); j++) {
			System.out.print("    ");
			track++;
		}
		int[] days = makeSureDays(year);
		for(int i = 1; i <= days[month - 1]; i++) {
			System.out.printf("%4d", i);
			track++;
			if(track % 7 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n");
		return (track % 7);
	}


}
