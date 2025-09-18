package JavaSeleniumProgram;

import java.io.File;

public class Filedeleating {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\HARITHA\\Documents\\Files\\Sample.txt");
		f.delete();
		System.out.println("Deleting the file");

	}

}
