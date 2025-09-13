package ProgramReviseTopics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		name=sc.nextLine();
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
