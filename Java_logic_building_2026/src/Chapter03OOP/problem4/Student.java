package Chapter03OOP.problem4;

public class Student {
	int rollNo;
	int age;
	String name;
	
	
public void setData(int rollNo, String name,int age) {
this.rollNo=rollNo;
this.age = age;
this.name = name;

	}

 void display() {
	 System.out.println("Name :"+name);
	 System.out.println("RollNo :"+rollNo);
	 System.out.println("Age :"+age);
	 
 }

	

}
