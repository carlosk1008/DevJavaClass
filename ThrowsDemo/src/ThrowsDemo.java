class ThrowsDemo {

	public static char prompt (String str) throws java.io.IOException {
		System.out.print(str + ": ");
		return (char) System.in.read();		
	}
	
	public static void main (String args[]) {
		char ch = 0;
		try {
			ch = prompt ("Entre com uma letra");
		} catch (Exception e) {
			System.out.println("I/O exception occurred.");
		}
		System.out.println("Você digitou " + ch);
	}
}
