package test2;

public class U5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10000;i<=100000;i+=10000) {
			double pi=0;
			for(int j=1;j<=i;j++) {
				pi+=Math.pow(-1, j+1)/(2*j-1);
			}
			pi*=4;
			System.out.println("i = " + i + " , " + "pi = " + pi);
		}

	}

}
