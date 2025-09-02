package JavaSeleniumProgram;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String name="taste";
		String name1="state";
		char c[]=name.toCharArray();
		char c1[]=name1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(c1));
		if(Arrays.equals(c, c1))
		{
			System.out.println("The String is Anagram");
		}
		else
		{
			System.out.println("The String is not Anaagram");
		}
		
				

	}

}
