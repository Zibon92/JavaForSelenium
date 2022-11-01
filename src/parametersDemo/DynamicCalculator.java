package parametersDemo;

public class DynamicCalculator {
	
	public static String getMyFullName(String first, String last)
	{
		String fullname=first+" "+last;
		return fullname;
	}
	
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public double sub(double x, double y)
	{
		double result= x-y;
		return result;
	}

}
