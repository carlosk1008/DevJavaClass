package trytype;
import java.io.FileNotFoundException;
import java.io.FileReader;

class TryDemo {

	public static void OpenFile() {
		try {
			FileReader f = new FileReader("notExist.txt");
		} catch (FileNotFoundException e) {
			System.out.println("N�o foi poss�vel encontrar o arquivo especificado");
		}
	}
	
	public static void main(String args[]) {
		OpenFile();
	}
}