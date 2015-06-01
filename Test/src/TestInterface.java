
public class TestInterface implements Printable{

	
	public void print()
	{
		System.out.println("Print something");
	}
	
	public void show()
	{
		System.out.println("Show Something");
		
	}
	public static void main(String[] args) {
		
		TestInterface obj=new TestInterface();
		obj.print();
		
		Printable pr=new TestInterface();
		
		pr.show();
		System.out.println("Value of min :"+MIN);
		
		
}
}
