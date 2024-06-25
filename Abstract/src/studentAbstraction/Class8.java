package studentAbstraction;

import java.util.Arrays;

public class Class8 extends Student{

	private int subject_Marks[];
	
	public Class8()
	{
		
	}
	
	public Class8(String name, int subject_Marks[])
	{
		super(name);
		this.subject_Marks = subject_Marks;
	}

	
	public double findPercentage() {
		
		int total = 0;
		
		for(int i=0;i<subject_Marks.length;i++)
		{
			total += subject_Marks[i];
		}
		
		double percentage = (total/500.0)*100.0;
		
		return percentage;
	}

	@Override
	public String toString() {
		return "Class8 [subject_Marks=" + Arrays.toString(subject_Marks) + ", name=" + getName() + ", Id =" + getId()
				+ "]";
	}
	
	
}
