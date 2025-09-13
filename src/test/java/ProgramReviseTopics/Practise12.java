package ProgramReviseTopics;

import java.util.Arrays;

public class Practise12 {
	static int countofnumbers=0;
	static int countofalphabets=0;
	static int countofspaces=0;
	String name;
	public void reverseString(String name) {
		this.name=name;
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			reverse = reverse + c;
		}
		System.out.println("The Reverse of the String is : " + reverse);

	}
	public void Palindrome(String name) {
	this.name=name;
		String reverse = "";

		for (int i=name.length()-1;i>= 0;i--) 
		{
			char c = name.charAt(i);
			reverse = reverse + c;
		}
	if(reverse.equals(name))
	{
		System.out.println("It is palindrome");
	}
	else
	{
		System.out.println("It is not palindrome");
	}
		

	}

	public  void counting(String name)
	{
		
		
		this.name=name;
		char c[]=name.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<name.length();i++)
		{
		 boolean k1=Character.isDigit(c[i]);
		 boolean k2=Character.isAlphabetic(c[i]);
		 boolean k3=Character.isSpaceChar(c[i]);
		
		 if(k1==true)
		 {
			 countofnumbers++;
		 }
		 if(k2==true)
		 {
			 countofalphabets++;
		 }
		 if(k3==true)
		 {
			 countofspaces++;
		 }
		}
		 System.out.println("Digits count is "+countofnumbers);
		 System.out.println("Alphabets count is "+countofalphabets);
		 System.out.println("spaces count is "+countofspaces);
		int special=name.length()-(countofnumbers+countofalphabets+countofspaces);
		System.out.println("Special characters count is "+special);
		}
	
	public static void main(String[] args) {

		Practise12 p1 = new Practise12();
		p1.reverseString("Google");
		p1.Palindrome("civic");
		p1.counting("My name is haritha 12333$%%");
		System.out.println(Math.sqrt(625));
		
	}

}
