
public class Test {

	int a =5 ;  //Non Static Variable
	static int b = 5; //Static Variable
	public static void main(String[] args) {
		
		Test test1 = new Test();
		System.out.println("Non Static >>"+test1.a++);
		System.out.println("Static >>"+test1.b++);
		
		Test test2 = new Test();
		System.out.println("Non Static >>"+test2.a++);
		System.out.println("Static >>"+test2.b++);
	}

}
