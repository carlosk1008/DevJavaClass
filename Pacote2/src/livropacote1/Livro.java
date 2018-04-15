package livropacote1;

public class Livro {
	
	private String titulo;
	private String autor;
	private int pubData;
	
	public Livro(String t, String a, int d) {
		titulo = t;
		autor = a;
		pubData = d;
	}
	
	public void show() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(pubData);
		System.out.println();
	}

}