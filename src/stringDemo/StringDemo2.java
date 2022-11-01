package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) 
	{
		String actual="Selenium Webdriver";
		String expected="selenium Webdriver1";
	
		
		boolean status=actual.equals(expected); //equal content and case sensitive
		boolean status2=expected.equalsIgnoreCase(actual);//equalsIgnoreCase it is not case sensitive
		System.out.println("Result:"+status);
		System.out.println("Result:"+status2);

	}
}

