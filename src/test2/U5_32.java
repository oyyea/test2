package test2;

public class U5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		while(number1==number2) {
			number2=(int)(Math.random()*10);
		}
		System.out.print(number1 + "" + number2);
	}

}
