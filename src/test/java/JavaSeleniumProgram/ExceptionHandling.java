package JavaSeleniumProgram;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		
		try
		{
			int a=1/0;
			System.out.println(a);
	}
		
		catch(ArithmeticException a1)
		{
			System.out.println("sorry there was a blocker we handled it");
		}
System.out.println("Good job");
}
}