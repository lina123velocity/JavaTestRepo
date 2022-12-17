
public class StaticMethodDemo {
	
	static void add() {
		System.out.println("This is method");
	}

	public static void main(String[] args) {
		
		StaticMethodDemo demo = new StaticMethodDemo();
		demo.add();
		
		StaticMethodDemo.add();
		
		add();

	}

}
