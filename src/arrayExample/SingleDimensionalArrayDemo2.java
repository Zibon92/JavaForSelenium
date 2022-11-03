package arrayExample;

public class SingleDimensionalArrayDemo2 {

	public static void main(String[] args) 
	{
		//20 byte of memory
		int school[][]=new int[2][2];
		
		school[0][0]=56;
		school[0][1]=89;
		school[1][0]=63;
		school[1][1]=59;
	
		
		//size limitation of array
		// limitation of type
		
		System.out.println("Array number: "+school[1][1]);
		
		

	}

}
