
public class Main {
	public static void main(String[] args) {
		A a  = new A();
		B b  = new B();
		A[] a1 = new A[10];
		a1[0] = b;
		System.out.println(a1[0].getClass());
		System.out.println(a1[0].getClass().getName());
	}
}
