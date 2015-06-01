
public class TestVariable {
	
	
	static int a=6; //class variable There is only one copy of static variable and even when the class is instantiated, the value remains the same
	int b=8; //instance variable Every time the class is instantiated, the object has their own copy of these variables.


	public static void main(String[] args) {
		TestVariable obj1=new TestVariable(); 
		TestVariable obj2=new TestVariable();

		obj1.a=10; 
		obj2.a=12;

		obj1.b=24; 
		obj2.b=36;

		System.out.println("Static a "+obj1.a); //12 
		System.out.println("Static a "+obj2.a); //12 
		System.out.println("Static a "+a); //12

		System.out.println("Non Static/instance variabe b "+obj1.b); //24 
		System.out.println("Non Static b "+obj2.b); //36

		
		
		
		
	}

}
