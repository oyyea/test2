package test2;

public class U5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0,sum=0;
	    for(int i=101;i<=2100;i++) {
	    	if(i%4==0&&i%100!=0||i%400==0) {
	    		System.out.printf("%d ", i);
		    	cnt++;
		    	sum++;
		    	if(cnt%10==0)System.out.println();
	    	}
	    }
	    System.out.println();
	    System.out.println("The sum is " + sum);
	}

}
