package throwtype;
import java.io.FileNotFoundException;
import java.io.FileReader;

class ThrowDemo {

	public static void OpenFile() throws FileNotFoundException {
			FileReader f = new FileReader("notExist.txt");
	}
	
	/*public static void main(String args[]) throws FileNotFoundException {
		OpenFile();
	}*/
	
	public static void main(String args[]) {
		try {
			OpenFile();
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível pode encontrar o arquivo especificado");
		}
	}
}
