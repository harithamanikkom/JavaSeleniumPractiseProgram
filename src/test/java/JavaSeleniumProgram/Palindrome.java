package JavaSeleniumProgram;

public class Palindrome {

	public static void main(String[] args) {
		String name="madam";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			reverse=reverse+c;
		}
if(reverse.equals(name))
{
	System.out.println(name+" "+" is palindrome");
}
else
{
	System.out.println(name+" "+" is not palindrome");
}
	}

}
