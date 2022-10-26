package conditionalStatement;

public class IFelseifStatement {

	public static void main(String[] args) {
		
		System.out.println("test start");
		
		String browser = "IE";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("TC executed on Chrome");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("TC executed on Firefox");	
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("TC executed on IE");	
		}
		else
		{
			System.out.println("Please provide valid browser");
		}
		System.out.println("test end");

	}

}
