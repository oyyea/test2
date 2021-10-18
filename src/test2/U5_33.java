package test2;

public class U5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++) {
			int sun=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sun+=j;
					if(sun>i) break;
				}
			}
			if(sun==i) System.out.println(i);
		}
	}

}
