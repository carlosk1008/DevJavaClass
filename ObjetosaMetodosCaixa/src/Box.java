class Box {
	double width;
	double height;
	double depth;
 
	Box(Box ob) { // passa o objeto construtor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// construtor usado quando todas as dimensões especificadas
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// construtor usado quando nenhuma dimensão especificada
	Box() {
		width  = -1; 
		height = -1; 
		depth  = -1; 
	}

	// construtor usado quando o cubo é criado
	Box(double len) {
		width = height = depth = len;
	}
	
	// calcular e devolver volume
	double volume() {
		return width * height * depth;
	}
}

class OverloadCons2 {
	public static void main(String args[]) {

		// criar caixas usando os vários construtores
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		Box myclone = new Box(mybox1); // criar cópia do mybox1
	 
		double vol;
		
		// obter volume da primeira caixa
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		
		// obter volume de segunda caixa
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		// obter volume de cubo
		vol = mycube.volume();
		System.out.println("Volume of cube is " + vol);
		
		// obter volume de clone
		vol = myclone.volume();
		System.out.println("Volume of clone is " + vol);
	 	
	}
}