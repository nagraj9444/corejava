package constructor;

public class TestThisKeyword {

	int a;
	int b;
	int c;
	static int d;

	TestThisKeyword() {
		System.out.println("This is a default constructor");
	}
	
	TestThisKeyword(int a, int b) {
		this();
		System.out.println("This is a parameterised constructor with 2 arguments");
		this.a=a;
		this.b=b;
	}

	TestThisKeyword(int a, int b, int c){
		this(a,b);
		System.out.println("This is a parameterized constructor with 3 arguments");
		this.c=c;
		
	}
	
	void display(){
		System.out.println("The output of constructor is :-" +a+","+b+","+c );
	}
	public static void main(String[] args) {
		TestThisKeyword obj=new TestThisKeyword(5,8,3);
		obj.display();
		
	}
}
