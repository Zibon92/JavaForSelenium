package learnInheritence;

public class ChildClass3 extends BaseClass{

	public static void main(String[] args) 
	{
		
		BaseClass obj1=new ChildClass3(); //You can not access child class if you give reference of base class in object
		obj1.add();
		obj1.sub();
		
		
	}
	public void mul()
	{
		System.out.println("I am base class and I am multiplication of 50");
	}
	public void div()
	{
		System.out.println("I am base class and I am division");
	}

}
