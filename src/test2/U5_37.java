package test2;

import java.util.Scanner;

public class U5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int n,i;
		n=sc.nextInt();
		int []a=new int[100];
		
		a[0]=n%2;
		n/=2;
		for(i=1;;i++) {
			if(n==0) break;
			a[i]=n%2;
			n/=2;
		}
		
		i--;
		while(i!=-1) {
			System.out.print(a[i]);
			i--;
		}
	}

}
