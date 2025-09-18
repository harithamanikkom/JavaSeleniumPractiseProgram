package JavaSeleniumProgram;

import java.io.File;

public class FileHandlingCreate {

	public static void main(String[] args) {
		
		//creating a new File
File f=new File("C:\\Users\\HARITHA\\Documents\\Files\\Sample.txt");  
try
{
	boolean status=f.createNewFile();
	if(status)
	{
		System.out.println("The new file Created");
	}
	else
	{
		System.out.println("File already exists");
	}
}catch(Exception e)
{
	System.out.println("An Error occured");
}
	}

}
