package abstracttion;

public abstract class Shape {

	public abstract void area();
	
	public abstract void perimeter();
	
	public void display()
	{
		System.out.println("I can also create non abstract method in abstract class:");
	}
}
