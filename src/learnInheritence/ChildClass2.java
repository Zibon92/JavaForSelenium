package learnInheritence;

public class ChildClass2 extends BaseClass{

	public static void main(String[] args) 
	{
		
		BaseClass obj1=new BaseClass();//you can not access child class method if you create base class object in child class
		obj1.add();
		obj1.sub();
		
		
	}
	public void mul()
	{
		System.out.println("I am base class and I am multiplication");
	}
	public void div()
	{
		System.out.println("I am base class and I am division");
	}

}
