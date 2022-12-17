
public class StatickeyWord {
	
	static int a= 10;
	int b =20;
	public static void main(String[] args) {
		//System.out.println(b);
		System.out.println(StatickeyWord.a); // Call by using className
		StatickeyWord statickeyWord = new StatickeyWord(); // Object creation
		System.out.println(statickeyWord.a); // call by using objectname

	}

}
