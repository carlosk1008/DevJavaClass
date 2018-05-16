class MultipleCatches {
	
	public static void main(String args[]) {
 
		try {
			
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
			
		} catch(ArithmeticException e) {
			System.out.println("Divide por 0: " + e);
		} finally {
			System.out.println("Leaving try ...");
		}

		System.out.println("Depois dos blocos try/catch.");
	}
	
}