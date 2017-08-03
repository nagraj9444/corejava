package constructor;

public class TestConstructor {

	int a;
	int b;
	int c;

	public TestConstructor() {
		System.out.println("This is default constructor");
	}

	public TestConstructor(int a) {
		this.a = a;
		System.out.println("This is parameterized constructor");
	}

	TestConstructor(int c, int b) {
		this.c = c;
		this.b = b;
		System.out.println("This is parameterized constructor");
	}

	void display() {
		System.out.println("The value of a is :- " + a);
	}

	void sum() {
		int d = c + b;
		System.out.println("sum of c & b is :-" + d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor obj = new TestConstructor();
		obj.display();
		;
		TestConstructor obj1 = new TestConstructor(4);
		obj1.display();
		TestConstructor obj2 = new TestConstructor(3, 5);
		obj2.sum();
	}
}
