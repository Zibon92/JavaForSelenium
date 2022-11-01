package parametersDemo;

public class PassParameterDemo1
{

	public static void main(String[] args) 
	{
		PassParameterDemo1 obj1 = new PassParameterDemo1();
		obj1.add(500, 100);
		obj1.sub(600.50, 250.50);
 
	}
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Result:"+c);
	}
	public void sub(double x, double y)
	{
		double result= y-x;
		System.out.println("Result is :"+result);
	}

}
