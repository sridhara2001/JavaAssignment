package in.assignment;

public class Problem29 {
	public static void DeciToOctal(int a) {
		int octal = 0;
		int i=1;
		while(a>0) {
			int rem = a%8;
			a=a/8;
			octal += rem*i;
			i=i*10;
		}
		System.out.println(octal);
	}
	
	public static void DeciToHexadeci(int b) {
		int hexadeci = 0;
		int i=1;
		while(b>0) {
			int rem = b%16;
			b=b/16;
			hexadeci += rem*i;
			i=i*10;
		}
		System.out.println(hexadeci);
	}

	public static void main(String[] args) {
		DeciToOctal(96);
		DeciToHexadeci(910);
	}

}
