package studentAbstraction;

public class School {

	public static void main(String[] args) {
		
		int marks[] = {88,98,78,67,88};
		Class8 diksha = new Class8("Diksha Y",marks);
		
		System.out.println(diksha.toString());
		
		int marks1[] = {88,98,78,67,88};
		Class8 raghav = new Class8("Raghav ",marks1);
		
		System.out.println(raghav.toString());
		
		int theory[] = {88,78,89,99,89};
		int practical[] = {99,99};
		
		Class11 raghav11 = new Class11("Raghav",practical,theory);
		Class11 diksha11 = new Class11("Diksha",practical,theory);
		
		System.out.println("class 11 Student details are below : ");
		
		System.out.println(raghav11.toString());
		System.out.println(diksha11.toString());
		
	}
}
