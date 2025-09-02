package JavaSeleniumProgram;

public class MethodOverloadingstatic {
	
	static void add()
	{
		System.out.println("1");
	}
	
	static void add(int a,int b)
	{
		System.out.println("2");
	}

	static void add(int a,int b,String c)
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		add();
		add(10,20);
		add(34,55,"haritha");
	}

}
