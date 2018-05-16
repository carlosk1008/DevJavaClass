class Super{
	int a;
	void who() {
		System.out.println("who() in su");
		
	}
}

class Sub1 extends Super{
	void who() {
		System.out.println("who() in sub1");
	}
	void j() {
		System.out.println("");
	}
}

class Sub2 extends Super{
	void who() {
		System.out.println("who() in sub2");
	}
}


public class DespachoDinamico {
	public static void main(String[] args) {
		Super superOb = new Super();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();
		
		Super superRef;
		
		superRef = superOb;
		superRef.who();
		
		superRef = subOb1;
		superRef.who();
				
		//superRef = subOb2;
		superRef.who();
		
		//superOb.who();
		//subOb1.who();
		//subOb2.who();
	}
}
