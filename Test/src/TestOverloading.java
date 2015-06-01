
public class TestOverloading {

	
	public int addition(int a,int b)
	{
		return a+b;
	}
	
	public int addition(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		TestOverloading obj=new TestOverloading();
		
		System.out.println(obj.addition(20, 30));
		System.out.println(obj.addition(20, 30,10));
		

	}

}
