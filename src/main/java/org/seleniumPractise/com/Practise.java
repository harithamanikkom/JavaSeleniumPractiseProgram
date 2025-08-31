package org.seleniumPractise.com;

import java.util.Arrays;

public class Practise {
	
	static int countofnumbers=0;
	static int countofalphabets=0;
	static int countofspaces=0;

	public static void main(String[] args) {
		String name="My name is Johny 12345#$%%%";
		int length=name.length();
		char c[]=name.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<length;i++)
		{
			
		boolean k1=Character.isDigit(c[i]);
		boolean k2=Character.isAlphabetic(c[i]);
		boolean k3=Character.isSpaceChar(c[i]);
		if (k1==true)
		{
			countofnumbers++;
		}
		if (k2==true)
		{
			countofalphabets++;
		}
		if (k3==true)
		{
			countofspaces++;
		}
		}
		System.out.println("Count of Digit is: "+countofnumbers);
		System.out.println("Count of Alphabets is: "+countofalphabets);
		System.out.println("Count of Spaces is: "+countofspaces);
		
		int special=length-(countofnumbers+countofalphabets+countofspaces);
		System.out.println("Special Characters is : "+special);
		
	}

}
