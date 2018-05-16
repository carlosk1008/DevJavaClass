class A {
	private int a;
	A(int x) {
		a=x;
		System.out.println("Construindo A");
	}
}
	
class B extends A{
	private int b;
	B(int y, int w) {
		super(y);
		b = w;
		System.out.println("Construindo B");
	}
}

public class OrdemConstrutor {
	public static void main(String[] args) {
		int y = 0, w = 0;
		B b = new B(y, w);
	}
}
