package test2;

import java.util.Scanner;

public class U5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		
		int line=sc.nextInt();
		for(int i=0;i<line;i++) {
			if(i!=0) System.out.print("\n");
			for(int j=line*4-4-4*i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				int po=(int)(Math.pow(2, j));
				System.out.printf("%4d",po);
			}
			for(int j=i;j>=1;j--) {
				int po=(int)(Math.pow(2, j));
				System.out.printf("%4d",po);
			}
		}
	}

}
