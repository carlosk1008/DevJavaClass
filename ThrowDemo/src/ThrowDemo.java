class ThrowDemo {
	public static void main(String args[]) {
		try {
			System.out.println("Antes throw");
			throw new ArithmeticException();
		} catch(ArithmeticException exc) {
			System.out.println("Exceção");
		} catch(Exception a) {
			
		}
	}
}