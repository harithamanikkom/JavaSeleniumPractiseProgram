package JavaSeleniumProgram;

public class Exception_HandleProg {

	public static void main(String[] args) {
		System.out.println("Program started!!!!!");
		try {
		int result=10/0;
		System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Exception: Division by Zero is not allowed ");
		}
		System.out.println("Program Successfully Executed");

	}

}
