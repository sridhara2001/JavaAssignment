package in.assignment;

public class Problem30 {
	public static void BinaryToOcta(String a) {
		StringBuffer str = new StringBuffer(a);
		str.reverse();
		int decimal=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='1') {
				decimal += (Math.pow(2, i));
			}
		}
		
		int octal = 0;
		int i=1;
		while(decimal>0) {
			int rem = decimal%8;
			decimal = decimal/8;
			octal += rem*i;
			i=i*10;
		}
		System.out.println(octal);
	}
	
	public static void OctalToBinary(int a) {
		int decimal=0;
		int i=0;
		while(a>0) {
			int rem = a%10;
			a = a/10;
			decimal += rem*Math.pow(8, i);
			i++;
		}
		
		int binary=0;
		int j=1;
		while(decimal>0) {
			int rem=decimal%2;
			decimal=decimal/2;
			binary += rem*j;
			j=j*10;
		}
		System.out.println(binary);
	}

	public static void main(String[] args) {
		BinaryToOcta("110111");
		OctalToBinary(45);
	}

}
