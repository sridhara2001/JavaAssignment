package in.assignment;

public class Problem27 {
	public static void BinaryToDeci(String a) {
		StringBuffer str = new StringBuffer(a);
		str.reverse();
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='1') {
				sum += (Math.pow(2, i));
			}
		}
		System.out.println(a+" in Binary = "+sum+" in Decimal");
	}
	
	public static void DeciToBinary(int a) {
		int binary=0;
		int i=1;
		while(a>0) {
			int rem=a%2;
			a=a/2;
			binary=binary+(rem*i);
			i=i*10;
		}
		System.out.println(binary);
	
		//Another Method
		int b=14;
		String binary1=Integer.toBinaryString(b);
		System.out.println(binary1);
	}

	public static void main(String[] args) {
		BinaryToDeci("1110");
		DeciToBinary(4);
	}

}
