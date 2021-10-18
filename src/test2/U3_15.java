package test2;

import java.util.Scanner;

public class U3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int number1=(int)(Math.random()*11);
		int number2=(int)(Math.random()*11);
		int number3=(int)(Math.random()*11);
		
		System.out.print("Enter 3 digits as lottery: ");
		String lot= new String();
		lot = sc.next();
		while(lot.length()!=3) {
			System.out.println("Illegal number");
			System.out.print("Enter 3 digits as lottery: ");
			lot = sc.next();
		}
		
		int match1=0,match2=0,match3=0;
		
		for(int i=0;i<lot.length();i++) {
			if(match1==0 && number1==(int)(lot.charAt(i)-'0')) {
				match1=i+1;
			}else if(match2==0 && number2==(int)(lot.charAt(i)-'0')) {
				match2=i+1;
			}else if(match3==0 && number3==(int)(lot.charAt(i)-'0')) {
				match3=i+1;
			}
		}
		
		int prise=0;
		if(match1!=0&&match2!=0&&match3!=0) {
			if(match1==1&&match2==2&&match3==3) {
				prise=10000;
			}else {
				prise=3000;
			}
		}else if(match1!=0||match2!=0||match3!=0){
			prise=1000;
		}
		
		System.out.println("The prize is: " + prise);
		
	}

}
