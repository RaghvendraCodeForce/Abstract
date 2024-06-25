package abstracttion;

public class Circle extends Shape{

	public float radius; 
	
	public Circle() {
		
	}
	
	public Circle(float radius)
	{
		this.radius = radius;
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void area()
	{
		System.out.println(3.14*(radius*radius));
	}
	
	public void perimeter()
	{
		System.out.println(2*3.14*radius);
	}
}
