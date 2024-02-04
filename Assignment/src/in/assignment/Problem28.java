package in.assignment;

public class Problem28 {
	public static void OctalToDeci(int a) {
		int i=0;
		int decimal =0;
		while(a!=0) {
			int rem = a%10;
			a=a/10;
			decimal += rem*Math.pow(8, i);
			i++;
		}
		System.out.println(decimal);
	}
	
	public static void HexadeciToDeci(int b) {
		int i=0;
		int decimal =0;
		while(b!=0) {
			int rem = b%10;
			b=b/10;
			decimal += rem*Math.pow(16, i);
			i++;
		}
		System.out.println(decimal);
	}

	public static void main(String[] args) {
		OctalToDeci(140);
		HexadeciToDeci(394);
	}

}
