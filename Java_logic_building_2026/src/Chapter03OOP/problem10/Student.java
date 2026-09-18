package Chapter03OOP.problem10;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	
	public int getRollNo() {
		return rollNo;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks>=0 && marks<=100) {
		this.marks = marks;}
		else {
			System.out.println("Enter the Valid marks");
		}
	}

	public void setRollNo(int rollNo) {
		this.rollNo= rollNo;
		
	}
	
	void displayData() {
		System.out.println("Name = "+name);
		System.out.println("Roll Number = "+rollNo);
		System.out.println("marks = "+marks);
		
	}
	
	

}
