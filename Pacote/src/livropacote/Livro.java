package livropacote;

class Livro {
	
	private String titulo;
	private String autor;
	private int pubData;
	
	Livro(String t, String a, int d) {
		titulo = t;
		autor = a;
		pubData = d;
	}
	
	void show() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(pubData);
		System.out.println();
	}

}
