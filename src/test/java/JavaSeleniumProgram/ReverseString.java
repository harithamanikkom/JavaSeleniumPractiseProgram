package JavaSeleniumProgram;

public class ReverseString {

	public static void main(String[] args) {
		String name="Haritha Manikkom";
		String reverse=" ";
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			reverse=reverse+c;
		}
System.out.println("The Reverse of the String is : "+reverse);
	}

}
