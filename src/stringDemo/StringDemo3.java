package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) 
	{
		String actual="Selenium Webdriver";
		String expected="Selenium";
	
		
		boolean status=actual.contains(expected);
		
		System.out.println("Result:"+status);
		

	}
}

