package Chapter03OOP.problem4;

public class Main {
	public static void main(String[] args) {
		Student sc = new Student();
		Student sc1 = new Student();
		Student sc2 = new Student();
		 
		sc.setData(100, "Pranav", 22);
		sc1.setData(103, "ankirt", 24);
		sc2.setData(102, "tejas", 23);
		
		sc.display();
		sc1.display();
		sc2.display();
		

	}

}
