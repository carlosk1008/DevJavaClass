class Exc1 {
	static void subroutine() {
		
		try {
			int d = 0;
			int a = 10 / d;
		} catch (ArithmeticException e ) {
			System.out.println("Divis�o por zero");
		}
	}

	public static void main(String args[]) {
		Exc1.subroutine();
	}
}