package pacotelivroext;

public class ProtectDemo {
	public static void main(String[] args) {
		
		ExtLivro livro[] = new ExtLivro[5];

		livro[0] = new ExtLivro("Java para iniciantes","Oracle", 2014, "Herbert");
		livro[1] = new ExtLivro("Engenharia de Software","Pressman", 2012, "Pressman");
		livro[2] = new ExtLivro("Como programar","Deitel", 2010, "Deitel");
		livro[3] = new ExtLivro("Sapiens","Harari", 2012, "Harari");
		livro[4] = new ExtLivro("Diretiro digital","Pinheiro", 2016, "Pinheiro");
		
		for (int i=0; i < livro.length; i++) {
			livro[i].show();
		}
		
		System.out.println("Mostrar livros por autor");
		
		for (int i = 0; i < livro.length; i++)
			if(livro[i].getAutor() == "Pinheiro")
				System.out.println(livro[i].getTitulo());
		
		//livro[0].titulo ... acesso a um campo protected não é permitido a não subclasses
		
	}
}
