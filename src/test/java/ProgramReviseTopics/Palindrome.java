package ProgramReviseTopics;

public class Palindrome {

	public static void main(String[] args) {
		String name="civic";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) 
		{
			char c=name.charAt(i);
			reverse=reverse+c;
		}
		if(reverse.equals(name)==true)
		{
			System.out.println(name+  ": String is Palindrome" );
		}
		else
		{
			System.out.println(name+  ": String is not Palindrome" );
		}

	}

}
