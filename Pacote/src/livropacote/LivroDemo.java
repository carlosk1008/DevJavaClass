package livropacote;

public class LivroDemo {

	public static void main(String[] args) {
		
		Livro livro[] = new Livro[5];

		livro[0] = new Livro("Java para iniciantes","Oracle", 2014);
		livro[1] = new Livro("Engenharia de Software","Pressman", 2012);
		livro[2] = new Livro("Como programar","Deitel", 2010);
		livro[3] = new Livro("Sapiens","Harari", 2012);
		livro[4] = new Livro("Diretiro digital","Pinheiro", 2016);
		
		for (int i=0; i < livro.length; i++) {
			livro[i].show();
		}
		
	}

}
