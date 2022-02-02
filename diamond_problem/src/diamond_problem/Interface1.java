package diamond_problem;

public interface Interface1 {

	 
	public default void display()   
	{  
	System.out.println("the display() method of Interface1 invoked");  
	}  
	}  
	interface Interface2  
	{  
	public default void display()   
	{  
	System.out.println("the display() method of Interface2 invoked");  
	}  
	}  
	 class DemoClass implements Interface1,Interface2  
	{  
	public void display()   
	{  
	Interface1.super.display();  
	Interface2.super.display();  
	}  
	public static void main(String args[])   
	{  
	DemoClass obj = new DemoClass();  
	obj.display();  
	}  
	}  
