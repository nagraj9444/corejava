package BasicOfJava;

public class StaticAndNonStaticInJava {
	int i;
	int j;
	static int p;
	static int k;
	
	public void test1(){
		System.out.println("test 1 is non static block");
	}
	public static void test2(){
		System.out.println("test 2 is static block");
	}
	public static void main(String[] args) {
		StaticAndNonStaticInJava obj = new StaticAndNonStaticInJava();
		obj.test1();
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		StaticAndNonStaticInJava.test2();
		System.out.println(StaticAndNonStaticInJava.k);
		System.out.println(StaticAndNonStaticInJava.p);
	}
}
