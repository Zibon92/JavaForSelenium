package compileTimePolymorphism;

public class CompileDemo1 {

	public static void main(String[] args)
	{
		CompileDemo1 obj1= new CompileDemo1();
		obj1.sum(45, 25);
		obj1.sum(60, 30, 10);
		obj1.sum(70.60, 60.50);
		obj1.sum(78.50, 100);
		obj1.sum(40, 30.50);
		
	}
	public void sum(double a, int b)   //Order of argument have been changed
	{
		double c= a+b;
		System.out.println("Sum of two numbers: "+c);
	}
	public void sum(int a, double b)   //Order of argument have been changed
	{
		double c= a+b;
		System.out.println("Sum of two numbers: "+c);
	}
	
	public void sum(double a, double b)  // Example of type of arguments
	{
		double c= a+b;
		System.out.println("Sum of two numbers: "+c);
	}
	public void sum(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum of two numbers: "+c);
	}
	public void sum(int a, int b,int d) //Example of number of arguments
	{
		int c= a+b+d;
		System.out.println("Sum of 3 numbers: "+c);
	}

}
