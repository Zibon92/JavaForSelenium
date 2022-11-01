package parametersDemo;

public class PassParameterDemo2 
{

	public static void main(String[] args)
	
	{
		DynamicCalculator obj1 = new DynamicCalculator();
		int sum= obj1.add(500, 100);
		System.out.println("The sum result:"+sum);
		double result= obj1.sub(600.50, 250.50);
		System.out.println("The subtraction:"+result);
		
		String fullname=DynamicCalculator.getMyFullName("Zibon","Chowdhury");
		System.out.println("Congrats!"+fullname);
 
	}
	
}
