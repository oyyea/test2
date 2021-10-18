package test2;

public class U5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10000;i<=100000;i+=10000) {
			double e=1;
			double jc=1;
			for(int j=1;j<=i;j++) {
				jc*=j;
				e+=1/jc;
			}
			System.out.println("i = " + i + " , " + "e = " + e);
		}
	}

}
