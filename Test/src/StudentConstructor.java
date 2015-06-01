
public class StudentConstructor {
	

	String name;
	int age;
	
	StudentConstructor(String n,int a)
	{
		name=n;
		age=a;
	}
	
public void display()
{
	System.out.println("name: " +name);
	System.out.println("age: "+age);
}
	public static void main(String[] args) {
		
		StudentConstructor student1=new	StudentConstructor("maanha",3);
		student1.display();
		
		
		
	}

}
