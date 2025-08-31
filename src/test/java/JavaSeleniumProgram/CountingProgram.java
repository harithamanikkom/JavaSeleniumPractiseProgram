//program to check number of alphabets,digits ,spaces and special characters in a program

package JavaSeleniumProgram;

import java.util.Arrays;

public class CountingProgram {

	
	static int countofnumbers=0;
	static int countofalphabets=0;
	static int spaces=0;
	public static void main(String[] args) {

		
String name="$######Haritha Giraffe 1234555656";
System.out.println(name.length());//gets the length of the String
char c[]=name.toCharArray();//converts the String into character array
System.out.println(Arrays.toString(c));//converts char array c  to readable string format

for (int i=0;i<name.length();i++)
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
	spaces++;
}
}

System.out.println("Digits  Counts is : "+countofnumbers);
System.out.println("Alphabets count  is : "+countofalphabets);
System.out.println("spaces Count is  "+spaces);

int specialcharacters= name.length()-(countofnumbers+countofalphabets+spaces);
System.out.println("Special Characters is "+specialcharacters);


	}

}
