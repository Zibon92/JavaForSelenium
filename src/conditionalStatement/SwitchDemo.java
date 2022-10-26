package conditionalStatement;

public class SwitchDemo {

	public static void main(String[] args) {
		int x=3;
		switch(x) 
		{
		case 1:
			System.out.println("Performance is poor");	
			break;
		case 2:
			System.out.println("Performance is slow");	
			break;
		case 3:
			System.out.println("Performance is average");	
			break;
		case 4:
			System.out.println("Performance is good");	
			break;
		case 5:
			System.out.println("Performance is excellent");	
			break;
			default:
				System.out.println("You are fired");
		}
	}

}
