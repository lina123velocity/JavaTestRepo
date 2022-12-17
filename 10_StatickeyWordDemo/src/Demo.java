
public class Demo {
	
	void test() {
		System.out.println("non static");
		Demo.x1();
	}

	// This is test Method
	void test2() {
		System.out.println("non static 2");
		Demo d = new Demo();
		d.test();
	}
	
	static void x1() {
		System.out.println(" static 2");
		Demo d1 = new Demo();
		d1.test();
		
	}
	public static void main(String[] args) {
		Demo d2 = new Demo();
		d2.test();

	}

}
