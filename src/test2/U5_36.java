package test2;

import java.util.Scanner;

public class U5_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		String isbn = new String();
		isbn = sc.next();
		
		int d=0;
		for(int i=0;i<isbn.length();i++) {
			d+=(isbn.charAt(i)-'0')*(i+1);
		}
		d%=11;
		
		char end;
		if(d==10) {
			end='X';
		}else {
			end=(char) (d+'0');
		}
		
		System.out.println("The ISBN-10 number is: " + isbn + end);
		

	}

}
