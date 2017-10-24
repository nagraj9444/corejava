package BasicOfJava;

public class StaticAndNonStaticInJava1 {

	public static void main(String[] args) {
		
		StaticAndNonStaticInJava obj = new StaticAndNonStaticInJava();
		obj.test1();
		
		StaticAndNonStaticInJava.test2();
		
		StaticAndNonStaticInJava obj1 = new StaticAndNonStaticInJava();
		obj1.test1();
		
		StaticAndNonStaticInJava obj2 = new StaticAndNonStaticInJava();
		obj2.test1();
		
		StaticAndNonStaticInJava.test2();
		StaticAndNonStaticInJava.test2();
	}
}
