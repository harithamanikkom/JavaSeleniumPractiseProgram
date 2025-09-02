package JavaSeleniumProgram;

public class MethodOverloadingnonstatic {

	void operation(int number1,int number2)
	{
		int a=30;
		int b=50;
		int sum=a+b;
		System.out.println("Sum is " +sum);
				
	}
	
	void operation(double number1,double number2)
	{
		double a=56.73;
		double b=37.8;
		double sub=a-b;
		System.out.println("Subtraction is : "+sub);
	}
	
	void operation(String  a,String  b,int c)
	{
		
		System.out.println("Division is very easy");
		
	}
	public static void main(String[] args) {
		MethodOverloadingnonstatic s1=new MethodOverloadingnonstatic();
		s1.operation(20,30);
		s1.operation(56.73,37.8);
		s1.operation("Manish","Haritha",34);
	} 

}
