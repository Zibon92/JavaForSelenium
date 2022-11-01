package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) 
	{
		String name="Selenium Webdriver";
		boolean status=name.startsWith("Selenium");
		System.out.println("Word start with:"+status);
		
		String name1="You are my world";
		boolean status2=name1.endsWith("world1");
		System.out.println("Word end with:"+status2);

	}
}

