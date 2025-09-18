package JavaSeleniumProgram;

import java.io.FileReader;

public class FileReadingProgram {

	public static void main(String[] args) {
		char data[] = new char[50];
		try {

			FileReader fr = new FileReader("C:\\Users\\HARITHA\\Documents\\Files\\Sample.txt");
			fr.read(data);
			System.out.println(data);
			fr.close();

		} catch (Exception e) {

			System.out.println("An error occurred");
		}

	}
}
