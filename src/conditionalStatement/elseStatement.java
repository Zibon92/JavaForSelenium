package conditionalStatement;

public class elseStatement {

	public static void main(String[] args) {
		
		System.out.println("test start");
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("TC executed on Chrome");
		}
		else
		{
			System.out.println("TC executed on Firefox: ");	
		}
		System.out.println("test end");

	}

}
