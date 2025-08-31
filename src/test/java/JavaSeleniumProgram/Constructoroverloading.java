package JavaSeleniumProgram;

public class Constructoroverloading {
	
	Constructoroverloading()
	{
		this("haritha",45);
		System.out.println("constructor1");
	}
	Constructoroverloading(String name,int age)
	{
		this("manish",45,35000);
		System.out.println("name is: "+name+","+ " Age is:"+age);
	}
	Constructoroverloading(String name1,int age1,int sal)
	{
		System.out.println("name is: "+name1+","+ " Age is:"+age1+","+"Salary is:"+sal);
	}
	public static void main(String[] args) {
		Constructoroverloading s1=new Constructoroverloading();
		//Constructoroverloading s2=new Constructoroverloading("haritha",35);
		//Constructoroverloading s3=new Constructoroverloading("manish",45,350000);

		
		
		

	}

}
