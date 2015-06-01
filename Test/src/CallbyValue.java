
public class CallbyValue {

	
	public static void doSomeStuff(int x)
	{
		 x=x+27;
		System.out.println("value of x inside doSomeStuff: "+x);
		
	}
	public static void printNext(int number){
		number++;

	System.out.println("number Inside printNext(): "+number);
	
	}
	
	
	public static void main(String[] args) {
		
		int number =3;
		printNext(number);
	 System.out.println("number Inside main(): "+number);
		int x;
		x=6;
		System.out.println("value of x before pass:  "+x);
		
		doSomeStuff(x);
		
		System.out.println("value of x after pass: "+x);

	}

}
