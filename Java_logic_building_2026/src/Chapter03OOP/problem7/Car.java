package Chapter03OOP.problem7;

public class Car {
	String name ;
	int age;
	

	Car(String name, int age){
		
		this.name = name;
		this.age = age;
		
	}

	void display() {
		 System.out.println("name :"+name);
		 System.out.println("age :"+age);
	}

}
