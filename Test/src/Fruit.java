
public class Fruit {

	public static void main(String[] args) {
		Apple apple=new Apple();
		System.out.println(apple.color);
		changeApple( apple);
		System.out.println(apple.color);
	}

	
	public static void changeApple(Apple apple)
	{
		// apple=new Apple();
		apple.color="green";
	}
	
	
}
