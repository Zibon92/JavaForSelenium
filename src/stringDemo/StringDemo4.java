package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) 
	{
		String fullname="Selenium-Laptop-HP-QTP";
		
		String []toolname=fullname.split("-");
		
		for(int i=0;i<toolname.length;i++)
		{
			System.out.println("value for "+i+" is "+toolname[i]);
		}
		

	}
}

