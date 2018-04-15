
public class SeriesDemo {

	public static void main(String[] args) {
		
		ByTwos ob = new ByTwos();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("O próximo valor é " + ob.getNext());
		}
			
		System.out.println("\nReiniciando ...");
		ob.reset();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("O próximo valor é " + ob.getNext());
		}
			
		System.out.println("\nIniciando de 100");
		ob.setStart(100);
		for (int i = 0; i < 5; i++) {
			System.out.println("O próximo valor é " + ob.getNext());
		}
		
	}

}
