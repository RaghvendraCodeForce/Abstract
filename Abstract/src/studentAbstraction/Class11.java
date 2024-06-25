package studentAbstraction;

import java.util.Arrays;

public class Class11 extends Student {

	private int practical[];
	private int theory[];
	
	public Class11()
	{
		
	}

	public Class11(String name, int practical[], int theory[])
	{
		super(name);
		this.practical = practical;
		this.theory = theory;
	}
	
	public double findPercentage() {
		
		int practicalTotal = 0;// physics, chemistry
		int theoryTotal = 0; // PCM,hindi,english
		
		for(int i=0;i<theory.length;i++)
		{
			theoryTotal += theory[i]; 
		}
		// int he below for loop when i am just checking the condition for
		// practical.lenght it's confusing it with local variable and understanding
		// that i am trying to call the array length so i need to change my var name
		
		for(int i=0;i<practical.length;i++)
		{
			practicalTotal += practical[i];
		}
		
		double percentage = ((theoryTotal*0.6)/500)+((practicalTotal*0.4)/200);
		
		return percentage*100.0;
	}

	@Override
	public String toString() {
		return "Class11 [practical=" + Arrays.toString(practical) + ", theory=" + Arrays.toString(theory)
				+ ", findPercentage()=" + findPercentage() + "]";
	}
	
}
