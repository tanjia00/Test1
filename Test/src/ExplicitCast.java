
public class ExplicitCast {

	public static void main(String[] args) {


		double d=324.34;
		byte b;
		int i=257;
		
	
		b=(byte)i;
		
		System.out.println("value after convert integer to byte:" +b);
		byte b1=(byte)d;
		System.out.println("value after convert double to byte:" +b1);
		i=(int)d;
		System.out.println("value after convert double to integer :" +i);

	}

}
