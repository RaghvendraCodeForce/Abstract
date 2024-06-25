package studentAbstraction;

public abstract class Student {

	private int id ;
	private static int idgen = 101;
	private String name;
	
	
	public Student()
	{
		id = idgen++;
	}
	
	public Student(String name)
	{
		this();
		this.name = name;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public abstract double findPercentage();

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
