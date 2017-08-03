package BasicOfJava;

public class ClassObjectMethod {

	public int height;
	public int weight;
	public String color;

	public void walk() {
		System.out.println("walk()");
	}

	public void eat(int i) {
		System.out.println(i);
	}

	public void run() {
		System.out.println("run()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObjectMethod obj = new ClassObjectMethod();
		obj.walk();
		obj.eat(6);
		obj.run();
		System.out.println(obj.height);
		ClassObjectMethod obj1 = new ClassObjectMethod();
		obj1.eat(8);
		ClassObjectMethod obj2 = new ClassObjectMethod();
		obj2.walk();
	}

}
