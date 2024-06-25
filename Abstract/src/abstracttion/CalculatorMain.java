package abstracttion;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.setRadius(1.2f);
		
		Circle c2 = new Circle(1.3f);
		
		System.out.println("Area of cirle 1 is :");
		c1.area();
		
		System.out.println("Perimeter of circle 1 is : ");
		c1.perimeter();
		
		System.out.println("*****************************");
		
		System.out.println("Area of circle 2 is :");
		c2.area();
		
		System.out.println("Permiter of circle 2 is :");
		c2.perimeter();
		
		
	}
}
