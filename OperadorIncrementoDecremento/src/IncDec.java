
public class IncDec {

	public static void main(String[] args) {

		int v, x, y, z;
		double vd, xd, yd, zd;
		
		v = 10;
		x = ++v;
		
		System.out.println("Incremento v: " + v);
		System.out.println("Incremento ++x: " + x);
		
		y = 10;
		z = y++;
		
		System.out.println("Incremento y: " + y);
		System.out.println("Incremento z++: " + z);
		
		
		vd = 10.4;
		xd = ++vd;
		System.out.println("Incremento double xd: " + xd);
		
		yd = 10.4;
		zd = yd++;
		System.out.println("Incremento double zd: " + zd);

	}

}
