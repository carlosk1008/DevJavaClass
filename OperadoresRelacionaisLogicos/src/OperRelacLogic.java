
public class OperRelacLogic {

	public static void main(String[] args) {
		
		int i, j;
		boolean b1, b2;
		
		i = 10;
		j = 11;
		
		if (i < j ) System.out.println("i < j");
		if (i <= j ) System.out.println("i <= j");
		if (i != j ) System.out.println("i != j");
		if (i == j ) System.out.println("isso não será executado");
		if (i >= j ) System.out.println("isso não será executado");
		if (i > j ) System.out.println("isso não será executado");
		
		b1 = true;
		b2 = false;
		
		if (b1 & b2) System.out.println("isso não será executado");
		if (!(b1 & b2)) System.out.println("!(b1 AND b2) é verdadeiro");
		if (b1 | b2) System.out.println("b1 OR b2 é verdadeiro");
		if (b1 ^ b2) System.out.println("b1 XOR b2 é verdadeiro");
		
		if ((b1 | b2 ) && (b1 ^ b2)) System.out.println("(b1 | b2 ) && (b1 ^ b2) são verdadeiros"); 

	}

}
