package test2;

public class U5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee=10000;
		for(int i=0;i<10;i++) {
			fee*=1.05;
		}
		System.out.println("Ten years later, the fee is " + fee);
		
		double sum=fee;
		for(int i=0;i<3;i++) {
			fee*=1.05;
			sum+=fee;
		}
		System.out.println("The total fee is " + sum);
	}

}
