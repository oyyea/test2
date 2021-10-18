package test2;

import java.util.Scanner;

public class U5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		
		int line=sc.nextInt();
		for(int i=0;i<line;i++) {
			if(i!=0) System.out.print("\n");
			for(int j=2*line-1-2*i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=i+1;j>0;j--) {
				System.out.print(j);
				if(j!=1) System.out.print(" ");
			}
			for(int j=2;j<=i+1;j++) {
				System.out.print(" ");
				System.out.print(j);
			}
		}
	}

}
