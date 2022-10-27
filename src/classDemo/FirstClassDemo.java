package classDemo;

public class FirstClassDemo {

	int x=20;
	int y=30;
	public static void main(String[] args) 
	{
		System.out.println("Program Start");
		FirstClassDemo obj1 =new FirstClassDemo();
		obj1.sum();
		System.out.println("Value of X:"+obj1.x);
		System.out.println("Value of Y:"+obj1.y);

		System.out.println("Program End");

	}
	public void sum()
	{
		int a=90;
		int b=80;
		int c= a+b;
		System.out.println("The sum of two number: "+c);
	}

}
