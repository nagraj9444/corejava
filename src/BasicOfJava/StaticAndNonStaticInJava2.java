package BasicOfJava;

public class StaticAndNonStaticInJava2 {
	int i;
	static int j;
	
	public void test1(){
		System.out.println(i);
		System.out.println(j);
	}
	public static void test2(){
		System.out.println(j);
		//System.out.println(i);
	}
}
