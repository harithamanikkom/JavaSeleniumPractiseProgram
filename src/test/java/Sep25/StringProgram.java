package Sep25;

import java.util.Arrays;

public class StringProgram {

	
	static int countofalphabets=0;
	public static void main(String[] args) {
		
		
		String name="Manish Kumar1234";
		char c[]=name.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<name.length();i++)
		{
			boolean k1=Character.isAlphabetic(c[i]);
			
		
		if(k1==true)
		{
			countofalphabets++;
		}
		}
System.out.println("The Aplhabets count is : "+countofalphabets);
	}

	}

