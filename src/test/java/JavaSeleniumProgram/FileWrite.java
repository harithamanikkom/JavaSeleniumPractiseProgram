package JavaSeleniumProgram;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {
		String message="Learn Java Programming";
		try
		{
			FileWriter fw=new FileWriter("C:\\Users\\HARITHA\\Documents\\Files\\Sample.txt");
			fw.write(message);
			System.out.println("Message written to File");
			fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println("An Error Occurred");
		}
	}

}
